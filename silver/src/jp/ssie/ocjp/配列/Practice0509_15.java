package jp.ssie.ocjp.配列;

import java.util.Random;

public class Practice0509_15 {
	public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(11); // 0から10までのランダムな数字
        System.out.println("ランダムな数字: " + randomNumber);
	}
}
