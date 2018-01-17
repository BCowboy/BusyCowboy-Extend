package com.hd123.wsw.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class JDBCUtils {
  private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
  
  private static final String DB_USERNAME = "test1";
  
  private static final String DB_PASSWORD = "test1";
  
  private static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
  
  static {
      try {
          Class.forName(DB_DRIVER).newInstance() ;
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "---------"+e.getMessage());
      }
  }
  
  public static Connection getConnection() {
      Connection conn = null;
      try {
          conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
      } catch (SQLException e) { 
          JOptionPane.showMessageDialog(null, "--------------------------"+e.getMessage());
           
      }
      return conn;
  }
}
