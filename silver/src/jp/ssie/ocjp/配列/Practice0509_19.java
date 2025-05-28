package jp.ssie.ocjp.配列;

import java.util.Random;
import java.util.Scanner;

public class Practice0509_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 月名とその英語表現の対応表
        String[] months = {"January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};
        
        // ランダムに月を選択
        int monthIndex = random.nextInt(12); // 0から11までのランダムな数値
        
        // 選ばれた月の番号を表示（デバッグ用）
        System.out.println((monthIndex + 1) + "月の英語表現は？");
        
        // ユーザーの入力を受け付ける
        String correctAnswer = months[monthIndex]; // 正解の月名
        
        // 正解か不正解かを判定
        boolean correct = false;
        
        // 正解が出るまで繰り返す
        while (!correct) {
            System.out.print(": ");
            String userInput = scanner.nextLine().trim();  // ユーザーの入力を取得
            
            if (userInput.equalsIgnoreCase(correctAnswer)) {
                // 正解の場合
                System.out.println("正解です！");
                correct = true;
            } else {
                // 不正解の場合
                System.out.println("不正解です");
            }
        }
        
        // 正解後、もう一度挑戦するか終了するか選べる
        while (true) {
            System.out.print("もう一度？ 1:Yes 2:No: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 改行を読み取るために追加
            
            if (choice == 1) {
                // もう一度挑戦
                monthIndex = random.nextInt(12); // 再度ランダムに月を選択
                correctAnswer = months[monthIndex];
                correct = false; // 再度挑戦するために初期化
                System.out.println((monthIndex + 1) + "月の英語表現は？");
                while (!correct) {
                    System.out.print(": ");
                    String userInput = scanner.nextLine().trim();  // ユーザーの入力を取得
                    if (userInput.equalsIgnoreCase(correctAnswer)) {
                        System.out.println("正解です！");
                        correct = true;
                    } else {
                        System.out.println("不正解です");
                    }
                }
            } else if (choice == 2) {
                // 終了
                System.out.println("終了します。");
                break;
            } else {
                // 無効な入力
                System.out.println("無効な選択肢です。もう一度選んでください。");
            }
        }
        scanner.close();
    }
}
