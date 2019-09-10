package sample;

import java.sql.*;

public class GetConn
{
    GetConn()
    {

    }
    static Connection con;
    static {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attedence_ref", "root", "nandish9591");
        }
        catch (Exception e)
        {
                e.printStackTrace();
        }
    }
 public static Connection getcon()
    {
        return con;
    }
}