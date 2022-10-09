import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample13_3 {

	public static void main(String[] args) {
		Path p1 = Paths.get("/Users/suzukishunyuu/Desktop/wcp/Java_practice/report.txt");
		Path p2 = Paths.get("report.txt");
		Path p3 = p2.toAbsolutePath();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p1.isAbsolute());
		System.out.println(p2.isAbsolute());
		
	}

}
