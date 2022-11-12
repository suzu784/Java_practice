package paiza;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCount2 {

    public static void main(String[] args) {
    	System.out.println("重複チェック");
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();

        while (sc.hasNext()) {
            String word = sc.next();
            int index = words.indexOf(word);
            if (index == -1) {
                words.add(word);
                counter.add(1);
            } else {
                counter.set(index, counter.get(index) + 1);
            }
        }

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i) + " " + counter.get(i));
        }
    }
}
