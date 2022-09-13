package AnchorLengthEst;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToDbByJDBC {
    //JDBC URL, username and password of MySQL server
    public static final String url = "jdbc:mysql://localhost:3306/bd-test";
    public static final String user = "root";
    public static final String password = "root";

    //JDBC variable for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static Connection getCon () {
        return con;
    }
    public static void setCon (Connection con){
        ConnectToDbByJDBC.con = con;
    }
    public static Statement getStmt () {
        return stmt;
    }
    public static void setStmt (Statement stmt){
        ConnectToDbByJDBC.stmt = stmt;
    }
    public static ResultSet getRs () {
        return rs;
    }
    public static void setRs (ResultSet rs){
        ConnectToDbByJDBC.rs = rs;
    }

}
