package AnchorLengthEst;

import Interfaces.CRUD;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase implements CRUD {

    public static void db_connect(String dbTbl, String Indx, String measure, String query2user){
        String query = "select * from " + dbTbl;
        try {
            ConnectToDbByJDBC.setCon(DriverManager.getConnection(ConnectToDbByJDBC.url, ConnectToDbByJDBC.user, ConnectToDbByJDBC.password));
            ConnectToDbByJDBC.setStmt(ConnectToDbByJDBC.getCon().createStatement());
            ConnectToDbByJDBC.setRs(ConnectToDbByJDBC.getStmt().executeQuery(query));
            System.out.println(query2user);
            while (ConnectToDbByJDBC.getRs().next()) {
                var id = ConnectToDbByJDBC.getRs().getInt(1);
                var parameter = ConnectToDbByJDBC.getRs().getNString(2);
                var id_Name = ConnectToDbByJDBC.getRs().getDouble(3);
                System.out.println(id + ") " + Indx + parameter + " = " + id_Name + measure);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                ConnectToDbByJDBC.getCon().close();} catch (SQLException e) {e.printStackTrace();}
            try {
                ConnectToDbByJDBC.getStmt().close();} catch (SQLException e) {e.printStackTrace();}
            try {
                ConnectToDbByJDBC.getRs().close();} catch (SQLException e) {e.printStackTrace();}
        }
    }

    public static double Read(String dbTbl, String id_Name) {
        String query = "select id_Name from " + dbTbl + " where id=" + id_Name;
        double Temp = 0;
        try {
            ConnectToDbByJDBC.setCon(DriverManager.getConnection(ConnectToDbByJDBC.url, ConnectToDbByJDBC.user, ConnectToDbByJDBC.password));
            ConnectToDbByJDBC.setStmt(ConnectToDbByJDBC.getCon().createStatement());
            ConnectToDbByJDBC.setRs(ConnectToDbByJDBC.getStmt().executeQuery(query));

            while (ConnectToDbByJDBC.getRs().next()) {
                Temp= ConnectToDbByJDBC.getRs().getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                ConnectToDbByJDBC.getCon().close();} catch (SQLException e) {e.printStackTrace();}
            try {
                ConnectToDbByJDBC.getStmt().close();} catch (SQLException e) {e.printStackTrace();}
            try {
                ConnectToDbByJDBC.getRs().close();} catch (SQLException e) {e.printStackTrace();}
        }
        return Temp;
    }

}