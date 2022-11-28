
public class HashCodeCheck {

	public static void main(String[] args) {
		String st1 = new String("st2");
		String st2 = st1;
		
		if(st1.equals(st2)) {
			System.out.println(st1.hashCode());
			System.out.println(st2.hashCode());
		}
		st2 = "other";
		System.out.println(st2.hashCode());

	}

}
