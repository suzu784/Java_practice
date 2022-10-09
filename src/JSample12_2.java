import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample12_2 {

	public static void main(String[] args) {
		Path p1 = Paths.get("doc/test.txt");
		Path p2 = Paths.get("dest");
		
		try {
			Files.move(p1, p2);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
