package Database;

import Utilities.Utils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Agency_App_DB {
      static String username;
      static String password;
      static String host;
      static String database;
      static Connection connection;

      public static void setDBProperties() throws IOException, SQLException, IOException {
            host = Utils.getGlobalValue("DB_HOST");
            username = Utils.getGlobalValue("DB_USERNAME");
            password = Utils.getGlobalValue("DB_PASSWORD");
            database = Utils.getGlobalValue("DATABASE");
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, username, password);
      }

      public static String getAgencyCount() throws SQLException, IOException {
            setDBProperties();
            String agencyCount = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT count(*) from agency;\n");
                  while (rs.next()) {
                        agencyCount = rs.getString("count(*)");
                  }
            } finally {
                  connection.close();
            }
            return agencyCount;
      }
      public static String getRecentAgenciesCount(String days) throws SQLException, IOException {
            setDBProperties();
            String recentAgenciesCount = new String();
            String query = "SELECT count(*) \n" +
                    "FROM agency \n" +
                    "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                    "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);
                  ResultSet rs = statement.executeQuery();
                  while (rs.next()) {
                        recentAgenciesCount = rs.getString("count(*)");
                  }
                  rs.close();
                  statement.close();
            } finally {
                  connection.close();
            }
            return recentAgenciesCount;
      }
      public static List<String> getRecentAgencies(String days) throws SQLException, IOException {
            setDBProperties();
            List<String> recentAgencies = new ArrayList<>();
            String query = "SELECT name, DATE_FORMAT(inserted_at, '%b %d') AS date \n" +
                          "FROM agency \n" +
                          "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                          "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);

                  ResultSet rs = statement.executeQuery();
                  while (rs.next())
                  {
                        recentAgencies.add(rs.getString("name")+" "+rs.getString("date"));
                  }
                  rs.close();
                  statement.close();
            }finally {
                  connection.close();
            }
            return recentAgencies;
      }

      public static String GetAgencyPassword() throws SQLException, IOException {
            setDBProperties();
            String password = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("select l.password \n" +
                          "    from login l\n" +
                          "    left join agency_emp emp on emp.id = l.agency_emp_id\n" +
                          "    join email em on em.id = emp.email_id\n" +
                          "    where em.email = 'elife24@gmail.com';");
                  while (rs.next()) {
                        password = rs.getString("password");
                        System.out.println(rs.getString("password"));
                  }
            } finally {
                  connection.close();
            }
            return password;
      }

      public static String getAgencyPassword() throws SQLException, IOException {
            setDBProperties();
            String password = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("select l.password \n" +
                          "    from login l\n" +
                          "    left join agency_emp emp on emp.id = l.agency_emp_id\n" +
                          "    join email em on em.id = emp.email_id\n" +
                          "    where em.email = 'elife24@gmail.com';");
                  while (rs.next()) {
                        password = rs.getString("password");
                        System.out.println(rs.getString("password"));
                  }
            } finally {
                  connection.close();
            }
            return password;
      }

      public static List<String> getB2BManagerListForAgency() throws SQLException, IOException {
            setDBProperties();
            List<String> B2bManagerDetails = new ArrayList<>();
            List<String> reversedRows = new ArrayList<>();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT person.first_name, person.last_name, email.email, fleet_emp_manager.start_date, fleet_emp_manager.end_date from employee \n" +
                          "INNER JOIN person on person.id = employee.person_id\n" +
                          "INNER JOIN email on email.id = employee.email_id\n" +
                          "INNER JOIN fleet_emp_manager on employee.id = fleet_emp_manager.employee_id\n" +
                          "where fleet_emp_manager.fleet_id = 12581;");

                  while (rs.next()) {
                        B2bManagerDetails.add(rs.getString("first_name") + " " + rs.getString("last_name"));
                        B2bManagerDetails.add(rs.getString("email"));
                        B2bManagerDetails.add(rs.getString("start_date"));
                        B2bManagerDetails.add(rs.getString("end_date"));
                  }
            } finally {
                  connection.close();
            }
            return B2bManagerDetails;
      }

      public static List<String> getAgencyByName() throws SQLException, IOException {
            setDBProperties();
            List<String> agencyNames = new ArrayList<>();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT agency.`name` as agency_name from agency " +
                          "WHERE agency.`name` LIKE \"%test%\";");
                  while (rs.next()) {
                        agencyNames.add(rs.getString("agency_name"));
                  }
            } finally {
                  connection.close();
            }
            System.out.println(agencyNames);
            return agencyNames;
      }

      public static String getAgencyNotes(String note) throws SQLException, IOException {
            setDBProperties();
            String agencyNote = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT note from note_agency WHERE notes = note;");
                  while (rs.next())
                  {
                        rs.getString("note");
                  }
            } finally
            {
                  connection.close();
            }
            return agencyNote;
      }
}
