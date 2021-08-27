import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class DropTable
{
public static void main(String[] args) throws Exception
{
String driver="oracle.jdbc.OracleDriver";
String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
String user="root";
String pwd="root";
String sql_query="Drop employees table";
Class.forName(driver);
Connection con=DriverManager.getConnection(jdbc_url,user,pwd);
Statement st=con.createStatement();
st.executeUpdate(sql_query);
System.out.println("Table Deleted Successfully");
con.close();
}
}


  
                                          

