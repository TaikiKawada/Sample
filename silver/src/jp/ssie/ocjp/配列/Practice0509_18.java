package jp.ssie.ocjp.配列;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Practice0509_18{
    public static void main(String[] args) {
        Random random = new Random();
        
        // 1～10の数を格納したリストを作成
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        
        // ランダムにシャッフル
        Collections.shuffle(numbers, random);
        
        // 配列を作成し、最初の5つの要素を設定
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = numbers.get(i);
        }

        // 配列の中身を全て表示
        System.out.println("配列の中身:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}