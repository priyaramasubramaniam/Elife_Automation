package Database;

import Utilities.Utils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Partner_App_DB {

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
      public static String getPartnerCount() throws SQLException, IOException {
            setDBProperties();
            String partnerCount = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT count(*) from partner;\n");
                  while (rs.next()) {
                        partnerCount = rs.getString("count(*)");
                  }
            } finally {
                  connection.close();
            }
            return partnerCount;
      }

      public static String getRecentPartnersCount(String days) throws SQLException, IOException {
            setDBProperties();
            String recentPartnersCount = new String();
            String query = "SELECT count(*) \n" +
                    "FROM partner \n" +
                    "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                    "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);
                  ResultSet rs = statement.executeQuery();

                  while (rs.next()) {
                        recentPartnersCount = rs.getString("count(*)");
                  }
                  rs.close();
                  statement.close();
            } finally {
                  connection.close();
            }
            return recentPartnersCount;
      }
      public static List<String> getRecentPartners(String days) throws SQLException, IOException {
            setDBProperties();
            List<String> recentPartners = new ArrayList<>();
            String query = "SELECT name, DATE_FORMAT(inserted_at, '%b %d') AS date \n" +
                    "FROM partner \n" +
                    "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                    "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);

                  ResultSet rs = statement.executeQuery();
                  while (rs.next())
                  {
                        recentPartners.add(rs.getString("name")+" "+rs.getString("date"));
                  }
                  rs.close();
                  statement.close();
            }finally {
                  connection.close();
            }
            return recentPartners;
      }
      public static String GetPartnerPassword() throws SQLException, IOException {
            setDBProperties();
            String password = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("select l.password \n" +
                          "    from login l\n" +
                          "    left join partner_emp emp on emp.id = l.partner_emp_id\n" +
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

      public static List<String> getPartnerByName() throws SQLException, IOException {
            setDBProperties();
            List<String> partnerNames = new ArrayList<>();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT partner.`name` as partner_name, partner.id as partner_id  from partner " +
                          "WHERE partner.`name` LIKE \"%test%\" ORDER BY partner.inserted_at ASC;\n ");
                  while (rs.next()) {
                        partnerNames.add(rs.getString("partner_name"));
                  }
            } finally {
                  connection.close();
            }
            System.out.println(partnerNames);
            return partnerNames;
      }


}
