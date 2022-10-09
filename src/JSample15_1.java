import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample15_1 {

	public static void main(String[] args) {
		Path p1 = Paths.get("./doc/report.txt");
		Path p2 = Paths.get("C:/document/doc/../pdf");
		
		System.out.println(p1 + " ->" + p1.normalize());
		System.out.println(p2 + " ->" + p2.normalize());

	}

}
