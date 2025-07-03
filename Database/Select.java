import java.sql.*;

public class Select {
    public static void main(String[] args) throws Exception {
        final String uname = "root";
        final String pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arpan", uname, pwd);
        Statement stmt = cn.createStatement();
        String query = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("Roll: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Address: " + rs.getString(3) + ", Marks: " + rs.getInt(4));
        }
        cn.close();
    }
}
