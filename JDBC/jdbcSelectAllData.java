import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcSelectAllData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
            PreparedStatement ps=c.prepareStatement("select * from student");
            //ps.executeUpdate //only DML
            //ps.executeQuery();  //only DQL
            ResultSet rs=ps.executeQuery();
            while(rs.next()==true){
                System.out.print(rs.getInt(1)+", ");
                System.out.print(rs.getString(2)+", ");
                System.out.print(rs.getInt(3)+", ");
                System.out.print(rs.getString(4)+", ");
                System.out.println();
            }
            rs.close();
            ps.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}
