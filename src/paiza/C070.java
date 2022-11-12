package paiza;

import java.util.LinkedList;
import java.util.Scanner;

public class C070 {
	
	// 数字がいくつ揃っているかを判定

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ポーカーを始めます。数字を入力してください");
        int line = sc.nextInt();
        sc.nextLine();
        LinkedList<Character> site = new LinkedList<Character>();
        char first;
        char second;
        int count=0;
        
        while(sc.hasNextLine()){
            String card = sc.nextLine();
            for(int i=0; i<card.length(); i++){
                site.add(card.charAt(i));
            }
            first=site.get(0);
            for(char number: site){
                if(first==number){
                    count+=1;
                }
            }
            if(count==4){
                System.out.println("Four Cord");
            }else if(count==3){
                System.out.println("Three Card");
            }else if (count==2){
                second=site.get(1);//二番目のカード番号
                for(int i=2; i<4;i++){
                    if(second==site.get(i)){
                        System.out.println("Two Pair");
                    }else if(i==3){
                        System.out.println("One Pair");
                    }
                }
            }else{
                System.out.println("No Pair");
            } 
        count=0;
        site.clear();
        }
	}

}