package car.sales;

import java.sql.*;
import javax.swing.*;
public class SQLCreateTable11 {
    
  public SQLCreateTable11(String tname,String a,String b,String f,String d) {
    
    Connection c;    SQLConnectionss MyCon;
    Statement stmt;  String SQL="";
    ResultSet rs;    DatabaseMetaData md;
    boolean found=false; String msg;
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
        if (tname.equals("add")) {
              SQL = "create table add (Sno1 int not null auto_increment,"
                      + "Manufacturer varchar(45),"
                      + "Year varchar(10),"
                      + "Model varchar(45),"
                      + "Price int(11),"
                      + "Km int(11),"
                      + "Info varchar(50),"
                      + "primary key (Sno1))";
              
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
      System.out.println(ex);
    }
  }
}