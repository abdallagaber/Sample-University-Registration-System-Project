import java.sql.*;
public class DB {
    
    public static Connection mycon(){
    
    Connection con = null;
    
    try{
    con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/registration","root","");
    }catch(SQLException e){
        System.out.println(e);
    }
    return con;
   }
    
}
