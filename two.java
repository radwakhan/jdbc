import java.sql.*;

public class two {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase", "root",
                    "khanradwa399");
            String q = "create table IF NOT EXISTS Student(Roll_No INT, Name VARCHAR(25))";
            // creating the statement
            try (Statement stmt = con.createStatement()) {
                stmt.executeUpdate(q);
                System.out.println("table created in database");
            }
            String insert = "insert into Student(Roll_No,Name) values (?,?)";
            try (PreparedStatement pstmt = con.prepareStatement(insert)) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "aaloo");
                pstmt.executeUpdate();

                pstmt.setInt(1, 2);
                pstmt.setString(2, "saurabh");
                pstmt.executeUpdate();

                pstmt.setInt(1, 3);
                pstmt.setString(2, "priyanhu");
                pstmt.executeUpdate();

                System.out.println("value inserted");
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
