package Controller.General_Controller;

import Controller.Character_Controller.Character_Stats_Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SQL_Controller<query> {

    // JDBC h2 driver and file settings
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:C:\\Users\\mathi\\OneDrive\\FIA\\DO IT\\rpg-it-swing\\src\\resources\\database\\RPGIT_DB";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static String fetchInt(String COLUMN, String TABLE, int CHARACTER_ID) {

        // set return variable
        String sQuery = null;

        // set query variable
        int query;

        // set sql search elements
        COLUMN = COLUMN;
        TABLE = TABLE;
        CHARACTER_ID = CHARACTER_ID;

        // create connection and prepare statement
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            // isert file settings ins connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            // create query
            String sql = "SELECT " + COLUMN + " FROM " + TABLE + " WHERE CHARACTER_ID = " + CHARACTER_ID ;

            // fire query
            ResultSet rs = stmt.executeQuery(sql);

            // get values from fetch
            while (rs.next()) {
                query = rs.getInt(COLUMN);
                sQuery = Integer.toString(query);
                //System.out.println("Query result = " + query);
            }

            //close statement und connection
            stmt.close();
            conn.close();

            // additional code for errorhandling
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return sQuery;
    }

    public static String fetchString(String COLUMN, String TABLE, int CHARACTER_ID) {

        String query = null;
        COLUMN = COLUMN;
        TABLE = TABLE;
        CHARACTER_ID = CHARACTER_ID;

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT " + COLUMN + " FROM " + TABLE + " WHERE" + COLUMN +"_ID = " + CHARACTER_ID ;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                query = rs.getString(COLUMN);
                //System.out.println("Query result = " + query);
            }
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return query;
    }

    public static int fetchMaxXP(String COLUMN, int LEVEL_ID ) {

        int query = 0;

        COLUMN = COLUMN;
        LEVEL_ID = LEVEL_ID;
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT " + COLUMN + " FROM LEVEL WHERE LEVEL_ID = " + LEVEL_ID ;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                query = rs.getInt(COLUMN);
                //System.out.println("Query result = " + query);

            }
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return query;
    }

    public static int fetchItemInt(String ITEM, int INVENTORY_ITEM_ID, String COLUMN) {

        int query = 0;

        ITEM = ITEM;
        INVENTORY_ITEM_ID = INVENTORY_ITEM_ID;

        COLUMN = COLUMN;

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT " + COLUMN + " FROM " + ITEM + " WHERE " + ITEM +"_ID = " + INVENTORY_ITEM_ID;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                query = rs.getInt(COLUMN);
                //System.out.println("Query result = " + query);

            }
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return query;
    }

    public static String fetchItemStr(String ITEM, int INVENTORY_ITEM_ID, String COLUMN) {

        String query = null;

        ITEM = ITEM;
        INVENTORY_ITEM_ID = INVENTORY_ITEM_ID;
        COLUMN = COLUMN;

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT " + COLUMN + " FROM " + ITEM + " WHERE " + ITEM +"_ID = " + INVENTORY_ITEM_ID;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                query = rs.getString(COLUMN);
                //System.out.println("Query result = " + query);

            }
            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return query;
    }

}


