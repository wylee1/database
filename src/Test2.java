import java.sql.*;
public class Test2
{
public static void main(String args[])
{
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(
"jdbc:mysql://192.168.56.101:4567/madang",
"wylee",
"madiq8047!@");
Statement stmt=con.createStatement();
stmt.executeUpdate(
                "DELETE FROM Book " +
                "WHERE bookid = '16'"
                );
con.close();
}catch(Exception e){ System.out.println(e);}
}

}