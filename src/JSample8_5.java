import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSample8_5 {

	public static void main(String[] args) {
		Path p1 = Paths.get("doc");
		
		if (Files.exists(p1) ) {
			System.out.println("ファイルまたはディレクトリは存在します");
		} else {
			System.out.println("ファイルまたはディレクトリは存在しません");
		}

	}

}
