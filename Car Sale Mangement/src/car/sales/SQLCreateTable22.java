package car.sales;

import java.sql.*;
import javax.swing.*;
public class SQLCreateTable22{
    
  public SQLCreateTable22(String tname,String a,String b,String f,String d) {
    
    Connection c;    SQLConnectionss MyCon;
    Statement stmt;  String SQL="";
    ResultSet rs;    DatabaseMetaData md;
    boolean found=false; String msg="";
    try {
      MyCon = new SQLConnectionss(a,b,f,d);
      c = MyCon.getConnection("carsales");
      md = c.getMetaData();
      rs = md.getTables(null, null, "%", null);
      while (rs.next()) {
        if (rs.getString(3).equals(tname)) {
          found = true;
          break;
        }
      }
      stmt = c.createStatement();
      if (!found) {
        if (tname.equals("login")) {
              SQL = "create table login (user varchar(10)  DEFAULT 'Admin',pass varchar(10)  DEFAULT '123')";
  
        }
         
        stmt.executeUpdate(SQL);
        md = c.getMetaData();
        rs = md.getTables(null, null, "%", null);
        msg = "Table >>> ";
        while (rs.next()) {
          if (rs.getString(3).equals(tname)) {
              msg = msg+rs.getString(3).toUpperCase();
              break;
          }
        }
        msg = msg+" is Created";
        JOptionPane.showMessageDialog(null, msg);
      }
    }
    catch (SQLException ex) {
      JOptionPane.showMessageDialog(null,ex);
    }
  }
}