import java.sql.*;

public class InsertRecordIntoMovies {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3390000\\userdb.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO Movies values ('Thor Love and Thunder','Chris Hemsworth','Natalie Portman',2022,'Taika Waititi');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO Movies values ('KGF:Chapter 2','Yash','Srinidhi Shetty', 2022,'Prashanth Neel');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO Movies values ('RRR','NTR,Ram Charan','Alia bhat,Oliva Morris', 2022,'Rajamouli');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO Movies values ('KGF:Chapter 1','Yash','Srinidhi Shetty', 2018,'Prashanth Neel');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO Movies values ('Ante Sundaraniki','Nani','Nazriya Nazim',2022,'Vivek Athreya');";
            stmt.executeUpdate(query4); // Create Query-4

            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}