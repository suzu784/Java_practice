import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample8_6 {

	public static void main(String[] args) {
		Path p1 = Paths.get("doc/test.txt");
		Path p2 = Paths.get("doc/test2.txt");
		
		try {
			Files.copy(p1, p2);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
