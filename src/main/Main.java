package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Importing database
import java.sql.*;
// Importing required classes
import java.util.*;

public class Main {
    private static String schoolName = "LP-School";
    private static int userSelection;
    private static boolean selectedEnrollment = false;
    private static String users;

    private static Scanner sc = new Scanner(System.in);

    public Date readDate() throws Exception {
        String dateFormat = "dd/MM/yyyy";
        Scanner scanner = new Scanner(System.in);
        return new SimpleDateFormat(dateFormat).parse(scanner.nextLine());
    }

    public static void showMainMenue() {
        System.out.println("Bienvenue sur la plateforme d'inscription à" + schoolName);

        System.out.println("\n\n\nSelectionnez l'opération que vous voulez faire");
        System.out.println("1: Inscription");
        System.out.println("2: Connexion");
    }

    public static int menueOperation() {
        selectedEnrollment = true;
        userSelection = sc.nextInt();
        System.out.println("Vous avez sélectionné l'option " + userSelection);
        return userSelection;
    }

    public static void enrollmentOperation() {
        String username = sc.nextLine();
        String password = sc.nextLine();
        String name = sc.nextLine();
        String firstName = sc.nextLine();
        int age = sc.nextInt();
    }

    public static boolean loginOperation() {
        String username = sc.nextLine();
        String password = sc.nextLine();

        return true;
    }



    public static void main(String[] args)throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/ecole"; // table details
        String username = "root"; // MySQL credentials
        String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        String query = "select * from classe"; // query to be run

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query); // Execute query
        rs.next();
        String className = rs.getString("nomclasse"); // Retrieve class name from db
        int classID = rs.getInt("idclasse");

        System.out.println("idClass: " + classID + "\nclassName: " + className); // Print result on console

        // Reading a new line
        rs.next();
        className = rs.getString("nomclasse"); // Retrieve class name from db
        classID = rs.getInt("idclasse");
        System.out.println("idClass: " + classID + "\nclassName: " + className); // Print result on console

        // Reading a new line
        rs.next();
        className = rs.getString("nomclasse"); // Retrieve class name from db
        classID = rs.getInt("idclasse");
        System.out.println("idClass: " + classID + "\nclassName: " + className); // Print result on console

        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}
