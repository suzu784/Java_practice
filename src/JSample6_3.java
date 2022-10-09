import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample6_3 {

	public static void main(String[] args) {
		Path p = Paths.get("/Users/suzukishunyuu/Desktop/wcp/Java_practice/report.txt");
		
		try {
			Files.delete(p);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
