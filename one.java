import java.sql.*;

public class one {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase", "root",
                    "khanradwa399");
            // System.out.println("connection created");
            if (con.isClosed()) {
                System.out.println("connection not created");
            } else {
                System.out.println("connection created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}