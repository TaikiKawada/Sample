import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSample2 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="SELECT name1,name2 FROM athlete";
		try {
			conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sample", "root", "root");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getInt("id")+":"+rs.getString("name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				}catch(SQLException e) {e.printStackTrace();}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				}catch(SQLException e){e.printStackTrace();}
			}
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {e.printStackTrace();}
				}	
			}
		}
	}

