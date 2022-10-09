import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample17_3 {

	public static void main(String[] args) {
		Path p1 = Paths.get("");
		Path p2 = p1.toAbsolutePath();
		
		System.out.println(p1);
		System.out.println(p2);
		
		// user.dir(ユーザーの現在の作業ディレクトリを示す)
		String userDir = System.getProperty("user.dir");
	    System.out.println(userDir);
	}

}
