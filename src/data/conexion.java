/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author jonatan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion {
 private String URL;
 private String Driver;
 private String User;
 private String Password;
 private String Error;
 public conexion() {
 Driver = "com.mysql.jdbc.Driver";
 URL = "jdbc:mysql://localhost:3306/obras2";
 User = "root";
 Password = "";
 }
 public Connection getConnection() {
 try {
 Class.forName(Driver).newInstance();
 return DriverManager.getConnection(URL, User, Password);
 } catch (ClassNotFoundException | InstantiationException |
IllegalAccessException | SQLException e) {
 System.out.println("error:" + e.getMessage());
 Error = e.getMessage();
 }
 return null;
 }

 public String getDriver() {
 return Driver;
 }
 public void setDriver(String Driver) {
 this.Driver = Driver;
 }
 public String getError() {
 return Error;
 }
 public void setError(String Error) {
 this.Error = Error;
 }

 public String getURL() {
 return URL;
 }
 public void setURL(String URL) {
 this.URL = URL;
 }
}
