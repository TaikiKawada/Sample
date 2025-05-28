package practice0422;

public class Word {
	private String ja;
	private String en;

	public Word(String ja, String en) {
		this.ja = ja;
		this.en = en;
	}

	public String getJa() {
		return ja;
	}

	public void setJa(String ja) {
		this.ja = ja;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}
	
	public boolean check(String input) {
		return en.equals(input);
	}
}
