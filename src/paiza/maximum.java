package paiza;

public class maximum {

	public static void main(String[] args) {
		String[] name = {"大田","中田","小田","山田","川田","村田","市田","町田","本田","島田"};
		int[] n = {68,30 ,100 ,43,78  ,61,53,48,92,88};
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "さんの点数は" + n[i] + "です");
		}

	}

}
