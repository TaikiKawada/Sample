package jp.ssie.ocjp.複合;

import java.util.Scanner;

public class Practice0509_4 {
    public static void main(String[] args) {
        String correctPassword = "letmein";  // 正しいパスワード
        int maxAttempts = 3;  // 最大試行回数
        int attempts = 0;  // 現在の試行回数
        
        // Scannerを使用してユーザーの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        
        // 最大試行回数まで繰り返しパスワードを入力させる
        while (attempts < maxAttempts) {
            System.out.print("パスワードを入力してください: ");
            String inputPassword = scanner.nextLine();
            
            // 入力が正しい場合
            if (inputPassword.equals(correctPassword)) {
                System.out.println("ログイン成功");
                break;  // 成功したら終了
            } else {
                attempts++;  // 間違えた回数を増加
                if (attempts < maxAttempts) {
                    System.out.println("パスワードが間違っています。残り試行回数: " + (maxAttempts - attempts));
                }
            }
        }
        
        // 3回間違えた場合の処理
        if (attempts == maxAttempts) {
            System.out.println("ログイン失敗");
        }
        
        scanner.close();  // リソースを解放
    }
}

