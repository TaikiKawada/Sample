package jp.ssie.ocjp.配列;

import java.util.Random;

public class Practice0509_17 {
	public static void main(String[] args) {
        Random random = new Random();
        int randValue = random.nextInt(100);
        
        if (randValue < 15) {
            System.out.println("大吉");
        } else if (randValue < 50) {
            System.out.println("吉");
        } else if (randValue < 85) {
            System.out.println("凶");
        } else {
            System.out.println("大凶");
        }
	}
}
