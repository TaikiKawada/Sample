package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Player;

public class PlayerService {
    private Connection conn; // ← フィールドとして接続を保持

    // ★ コンストラクタでConnectionを受け取って初期化
    public PlayerService(Connection conn) {
        this.conn = conn;
    }

    // SELECT文でPlayer一覧を取得するメソッド
    public List<Player> select() {
        List<Player> players = new ArrayList<>();
        String sql = "SELECT * FROM players";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Player player = new Player(); // インスタンス化
                player.setId(rs.getInt("id"));
                player.setName(rs.getString("name"));
                player.setCountry_id(rs.getInt("country_id"));
                player.setPosition(rs.getString("position"));

                players.add(player); // リストに追加
            }
            System.out.println(rs.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
      

        return players;
        
    }

    // 必要であれば、INSERTやUPDATEの処理もここに追加できます
}
