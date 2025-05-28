package jp.ssie.ocjp.複合;

import java.util.Scanner;

public class Practice0509_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nの入力を受け取る
        System.out.print("Nの値を入力してください: ");
        int N = scanner.nextInt();
        
        // 1からNまでの数を順にチェックして出力
        for (int i = 1; i <= N; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
