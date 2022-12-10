package polymorphism;

public class StuSample {

	public static void main(String[] args) {
		TandF taf = new TandF("陸上競技部");
		Football fb = new Football("サッカー部");
		
		Student stu1 = new Student("菅原", taf);
		stu1.display();
		stu1.practice();
		
		Student stu2 = new Student("櫻井", fb);
		stu2.display();
		stu2.practice();

	}

}
