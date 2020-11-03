package org.example;
import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;


        String url = "jdbc:postgresql://127.0.0.1:5432/homework";
        String user = "postgres";
        String password = "kw1996";

        try {
            System.out.println("SQL Programming Test");
            System.out.println("Connecting PostgreSQL database");

            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();

            Scanner scan = new Scanner(System.in);

            System.out.println("Creating College, Student, Apply relations");
            Create create = new Create();
            create.createMethod();

            System.out.println("Inserting tuples to College, Student, Apply relations");
            Insert insert = new Insert();
            insert.insertMethod();

            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();

            System.out.println("Query1");
            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();
            Query1 query1 = new Query1();
            query1.query1Method();

            System.out.println("Query2");
            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();
            Query2 query2 = new Query2();
            query2.query2Method();

            System.out.println("Query3");
            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();
            Query3 query3 = new Query3();
            query3.query3Method();

            System.out.println("Query4");
            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();
            Query4 query4 = new Query4();
            query4.query4Method();

            System.out.println("Query5");
            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();
            Query5 query5 = new Query5();
            query5.query5Method();

            System.out.println("Query6");
            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();
            Query6 query6 = new Query6();
            query6.query6Method();

            System.out.println("Query7");
            System.out.println("Continue? (Enter 1 for continue)");
            scan.nextLine();
            Query7 query7 = new Query7();
            query7.query7Method();

        } catch (SQLException sqlEX) {
            System.out.println(sqlEX);
        }
    }
}
