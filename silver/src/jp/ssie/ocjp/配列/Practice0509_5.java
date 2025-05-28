package jp.ssie.ocjp.配列;

import java.util.ArrayList;

public class Practice0509_5 {
    public static void main(String[] args) {
       
        ArrayList<String> names = new ArrayList<>();

    
        names.add("鈴木");
        names.add("佐藤");
        names.add("田中");
        names.add("井上");
        names.add("前田");

       
        System.out.println(names.get(names.size() - 1));

      
        names.remove(1);

        
        System.out.println("全ての要素:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
