import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class sql {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","helloworld");
		Statement st = con.createStatement();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter Table Name: ");
		//String sr = br.readLine();
		//tring query = "Create table " + sr + "(ENO number(3) primary key, ENAME varchar(255), ESAL float(5))";
		String query = "insert into haider values(6, 'sarmad', 2.4)";
		st.executeUpdate(query);
		System.out.println("added");
		st.close();
		con.close();
		
	}

}
