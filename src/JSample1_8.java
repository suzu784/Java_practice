import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample1_8 {

	public static void main(String[] args) {
		Path p1 = Paths.get("C:/code/java/file");
		Path p2 = Paths.get("C:", "code", "java", "file", "report.txt");
		Path p3 = Paths.get("C:\\code\\java\\file\\report.txt");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
