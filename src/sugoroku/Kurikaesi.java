package sugoroku;

public class Kurikaesi {

	public static void main(String[] args) {
		// ゴールについたらフラグを立てる
		int flg = 0;
		final int GOAL = 20;
		
		// masume 初期化
		int masume[] = {0, 0, 0, 0, 0, 0};
		String name[] = {"curedream", "curebeauty", "curegrace", "cureheart", "curesparcle", "curemelody"};
		
		// 誰かがゴールにつくまで繰り返す
		while(flg == 0) {
			// プレイヤー文繰り返す
			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i] + "さんの番です");
				int result = new java.util.Random().nextInt(6) + 1;
				// 前のマスに加算する
				masume[i] = masume[i] + result;
				System.out.println(result + "つ進んでください");
				if (masume[i] >= GOAL) {
					System.out.println("GOAL!" + name[i] + "さん、優勝です");
					flg = 1;
					// 優勝が決まったのでループを抜ける
					break;
				} else {
					System.out.println(name[i] + "さん" + masume[i] + "のマスに到着です。");
				}
			}
		}

	}

}
