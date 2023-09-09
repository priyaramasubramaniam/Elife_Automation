package Database;

import Utilities.Utils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Affiliate_App_DB {
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

      public static String getAffiliateCount() throws SQLException, IOException {
            setDBProperties();
            String affiliateCount = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT count(*) from affiliate;\n");
                  while (rs.next()) {
                        affiliateCount = rs.getString("count(*)");
                  }
            } finally {
                  connection.close();
            }
            return affiliateCount;
      }

      public static String getRecentAffiliatesCount(String days) throws SQLException, IOException {
            setDBProperties();
            String recentAffiliatesCount = new String();
            String query = "SELECT count(*) \n" +
                    "FROM affiliate \n" +
                    "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                    "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);
                  ResultSet rs = statement.executeQuery();
                  while (rs.next()) {
                        recentAffiliatesCount = rs.getString("count(*)");
                  }
            } finally {
                  connection.close();
            }
            return recentAffiliatesCount;
      }

      public static List<String> getRecentAffiliates(String days) throws SQLException, IOException {
            setDBProperties();
            List<String> recentAffiliates = new ArrayList<>();
            String query = "SELECT name, DATE_FORMAT(inserted_at, '%b %d') AS date \n" +
                    "FROM affiliate \n" +
                    "WHERE inserted_at > DATE_SUB(CURDATE(), INTERVAL ? DAY) \n" +
                    "ORDER BY inserted_at DESC;";
            try {
                  PreparedStatement statement = connection.prepareStatement(query);
                  statement.setString(1, days);

                  ResultSet rs = statement.executeQuery();
                  while (rs.next())
                  {
                        recentAffiliates.add(rs.getString("name")+" "+rs.getString("date"));
                  }
                  rs.close();
                  statement.close();
            }finally {
                  connection.close();
            }
            return recentAffiliates;
      }
      public static String GetAffiliatePassword() throws SQLException, IOException {
            setDBProperties();
            String password = new String();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("select l.password \n" +
                          "    from login l\n" +
                          "    left join affiliate_emp emp on emp.id = l.affiliate_emp_id\n" +
                          "    join email em on em.id = emp.email_id\n" +
                          "    where em.email = 'johndessie2@gmail.com';");
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

      public static List<String> getAffiliateByName() throws SQLException, IOException {
            setDBProperties();
            List<String> affiliateNames = new ArrayList<>();
            try {
                  Statement statement = connection.createStatement();
                  ResultSet rs = statement.executeQuery("SELECT affiliate.`name` as affiliate_name from affiliate " +
                          "WHERE affiliate.`name` LIKE \"%test%\";\n");
                  while (rs.next()) {
                        affiliateNames.add(rs.getString("affiliate_name"));
                  }
            } finally {
                  connection.close();
            }
            System.out.println(affiliateNames);
            return affiliateNames;
      }



}
