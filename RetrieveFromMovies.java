import java.sql.*;
public class RetrieveFromMovies {
    public static void main(String[] args) {

        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:C:\\SQLite\\sqlite-tools-win32-x86-3390000\\userdb.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM Movies;");

            while (rs.next()) {

                String movieName = rs.getString("MovieName");

                String Actor = rs.getString("ActorName");

                String Actress = rs.getString("ActressName");

                int releaseYear = rs.getInt("ReleaseYear");
                
                String Director = rs.getString("DirectorName");
                
                System.out.println("------------------------------");
                
                System.out.println("Movie         : " + movieName);

                System.out.println("Actor         : " + Actor);

                System.out.println("Actress       : " + Actress);

                System.out.println("Release Year  : " + releaseYear);
                
                System.out.println("Director      : " + Director);
                
                System.out.println("--------------------------------");

                System.out.println();

            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Data retrieval successful!!");
    }
}