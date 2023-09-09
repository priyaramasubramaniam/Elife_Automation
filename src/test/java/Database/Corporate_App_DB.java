package Database;

import Utilities.Utils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Corporate_App_DB {
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
            connection  = DriverManager.getConnection("jdbc:mysql://"+host+"/"+database, username, password);
      }

      public static String getCorporateCount() throws SQLException, IOException {
            setDBProperties();
            String corporateCount = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT count(*) from corporate;\n");
                  while (rs.next()) {
                        corporateCount = rs.getString("count(*)");
                  }
            } finally {
                  connection.close();
            }
            return corporateCount;
      }

      public static String getRecentCorporatesCount(String days) throws SQLException, IOException {
            setDBProperties();
            String recentCorporatesCount = new String();
            String query = "SELECT count(*) \n" +
                    "FROM corporate \n" +
                    "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                    "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);
                  ResultSet rs = statement.executeQuery();
                  while (rs.next()) {
                        recentCorporatesCount = rs.getString("count(*)");
                  }
                  rs.close();
                  statement.close();
            } finally {
                  connection.close();
            }
            return recentCorporatesCount;
      }

      public static List<String> getRecentCorporates(String days) throws SQLException, IOException {
            setDBProperties();
            List<String> recentCorporates = new ArrayList<>();
            String query = "SELECT name, DATE_FORMAT(inserted_at, '%b %d') AS date \n" +
                    "FROM corporate \n" +
                    "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                    "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);

                  ResultSet rs = statement.executeQuery();
                  while (rs.next())
                  {
                        recentCorporates.add(rs.getString("name")+" "+rs.getString("date"));
                  }
                  rs.close();
                  statement.close();
            }finally {
                  connection.close();
            }
            return recentCorporates;
      }


      public static String GetCorporatePassword() throws SQLException, IOException {
            setDBProperties();
            String password = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("select l.password \n" +
                          "    from login l\n" +
                          "    left join corporate_emp emp on emp.id = l.corporate_emp_id\n" +
                          "    join email em on em.id = emp.email_id\n" +
                          "    where em.email = 'lisa@test.com';");
                  while (rs.next()){
                        password = rs.getString("password");
                        System.out.println(rs.getString("password"));
                  }
            }
            finally {
                  connection.close();
            }
            return password;
      }

      public static List<String> getCorporateByName() throws SQLException, IOException {
            setDBProperties();
            List<String> corporateNames = new ArrayList<>();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT corporate.`name` as corporate_name from corporate " +
                          "WHERE corporate.`name` LIKE \"%test%\";\n");
                  while (rs.next()) {
                        corporateNames.add(rs.getString("corporate_name"));
                  }
            } finally {
                  connection.close();
            }
            System.out.println(corporateNames);
            return corporateNames;
      }

      public static String getCorporateFormattedAddress(String corp_name) throws SQLException, IOException {
            setDBProperties();
            String corporateFormattedAddress = new String();
            String query = "SELECT address.formatted_address as formatted_address from corporate\n" +
                    "\tINNER JOIN place on place.id = corporate.place_id\n" +
                    "\tINNER JOIN address on address.id = place.address_id\n" +
                    "\tWHERE corporate.name = ?";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, corp_name);

                  ResultSet rs = statement.executeQuery();
                  if (rs.next())
                  {
                        corporateFormattedAddress = rs.getString("formatted_address");
                  }
                  rs.close();
                  statement.close();
            }
            finally {
                  connection.close();
            }
            System.out.println(corporateFormattedAddress);
            return corporateFormattedAddress;
      }

      public static String getCorporateID() throws SQLException, IOException {
            setDBProperties();
            String corporateId = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT corporate.id, corporate.`name`,address.formatted_address, email.email, person.first_name, person.last_name, person.middle_name, cell_phone.number from corporate\n" +
                          "INNER JOIN place ON place.id = corporate.place_id\n" +
                          "INNER JOIN corporate_emp on corporate_emp.id = corporate.admin_emp_id\n" +
                          "INNER JOIN email on email.id = corporate_emp.email_id\n" +
                          "INNER JOIN cell_phone on cell_phone.id = corporate_emp.cell_phone_id\n" +
                          "INNER JOIN person on person.id = corporate_emp.person_id\n" +
                          "INNER JOIN address ON address.id = place.address_id\n" +
                          "ORDER BY corporate.inserted_at DESC LIMIT 1;");
                  while (rs.next()) {
                        corporateId = rs.getString("id");
                  }
            } finally {
                  connection.close();
            }
            System.out.println(corporateId);
            return corporateId;
      }

      public static List<String> getCorporateDetails() throws SQLException, IOException {
            setDBProperties();
            List<String> corporateDetails = new ArrayList<>();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT corporate.id, corporate.`name`,address.formatted_address, person.first_name, email.email,  cell_phone.number from corporate\n" +
                          "INNER JOIN place ON place.id = corporate.place_id\n" +
                          "INNER JOIN corporate_emp on corporate_emp.id = corporate.admin_emp_id\n" +
                          "INNER JOIN email on email.id = corporate_emp.email_id\n" +
                          "INNER JOIN cell_phone on cell_phone.id = corporate_emp.cell_phone_id\n" +
                          "INNER JOIN person on person.id = corporate_emp.person_id\n" +
                          "INNER JOIN address ON address.id = place.address_id\n" +
                          "ORDER BY corporate.inserted_at DESC LIMIT 1;");
                  while (rs.next())
                  {
                        corporateDetails.add(rs.getString("id"));
                        corporateDetails.add(rs.getString("name"));
                        corporateDetails.add(rs.getString("formatted_address"));
                        corporateDetails.add(rs.getString("first_name"));
                        corporateDetails.add(rs.getString("email"));
                  }
            }finally {
                  connection.close();
            }
            System.out.println(corporateDetails);
            return corporateDetails;
      }
}
