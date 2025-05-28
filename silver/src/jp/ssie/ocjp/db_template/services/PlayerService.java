package jp.ssie.ocjp.db_template.services;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.ssie.ocjp.db_template.beans.Player;
import jp.ssie.ocjp.db_template.utils.Db;

public class PlayerService {
	
	//select文のメソッド
	public List<Player> select(){
		List<Player> players=new ArrayList<>();
		Connection conn=Db.open();
		
		String sql="SELECT * FROM player";
		
		try(Statement stmt=conn.createStatement();
			ResultSet rs =stmt.executeQuery(sql)){
			while(rs.next()) {
			Player Player=new Player();
			Player.setId(rs.getInt("id"));
			Player.setName(rs.getString("name"));
			Player.setCountry_id(rs.getString("country_id"));
			Player.setPosition(rs.getString("position"));
			
			players.add(player);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return players;
		}
		
		//insert文のメソッド
			
			
		}
	}
}
