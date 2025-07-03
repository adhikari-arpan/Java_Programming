import java.sql.*;

public class Count {
    public static void main(String[] args) throws Exception {
        final String uname = "root";
        final String pwd = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arpan", uname, pwd);
        Statement stmt = cn.createStatement();
        String query = "SELECT count(ROLL) FROM student";
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
        	System.out.println("Count: " + rs.getInt(1));
        }
        cn.close();
    }
}
