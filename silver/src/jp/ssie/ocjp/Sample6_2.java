package jp.ssie.ocjp;

import practice0427.Human;

public class Sample6_2 {
	public static void main(String[] args) {
		Human h1=new Human();
		h1.setData();
		h1.showData();
		h1.setData("高橋");
		h1.showData();
		h1.setData("鈴木",25);
		h1.showData();
	}
}
