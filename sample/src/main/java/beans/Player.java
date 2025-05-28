package beans;

import java.time.LocalDate;
//l
public class Player {
	private int id;
	private int country_id;
	private int uniform_num;
	private String position;
	private String name;
	private String club;
	private LocalDate birth;
	private int height;
	private int weight;
	
	
	//getter.setter a
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int string) {
		this.country_id = string;
	}
	public int getUniform_num() {
		return uniform_num;
	}
	public void setUniform_num(int uniform_num) {
		this.uniform_num = uniform_num;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}

