/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.project;

/**
 *
 * @author abdal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {
// to use it with online database
    
//    private final String user = "sql6495678";
//    private final String password = "FfXZcyP1f6";
//    private final String url = "jdbc:mysql://sql6.freesqldatabase.com/sql6495678";
    
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost/student";
    public Connection connectSql(){
        try{
        Connection con = DriverManager.getConnection(url,user,password);
        return con;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }        
    
    
}
