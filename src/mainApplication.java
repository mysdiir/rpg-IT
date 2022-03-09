package GUI;

import Controller.Character_Controller.Character_Stats_Controller;
import Controller.General_Controller.SQL_Controller;

import javax.swing.*;
import java.awt.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class mainApplication {

    // JDBC h2 driver and file settings
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:C:\\Users\\mathi\\OneDrive\\FIA\\DO IT\\rpg-it-swing\\src\\resources\\database\\RPGIT_DB";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {

    // create gui
    GUI mainGUI = new GUI();

    // fetch character stats and implement in main method
    mainGUI.setCharacterStats(1);


    }







}

