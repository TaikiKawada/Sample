import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// レコードに対応するクラス
class Sample {
    private int id;
    private String name;

    public Sample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class JdbcSample2_2 {
    public static void main(String[] args) {
        String sql = "SELECT id, name FROM user";
        ArrayList<Athlete> list = new ArrayList<>();

        // try-with-resources構文
        try (
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sample", "root", "root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                Athlete a=new Athlete(
                		rs.getInt("athlete_id"),
                		rs.getString("name1"),
                		rs.getString("name2"),
                		rs.getInt("event_id"),
                		rs.getString("gender")
                		);
                		
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 結果表示
        athletes.stream()
        .forEach(s->System.out.println(s.getName1()+" "+s.getName2()));
    }
    }
}
