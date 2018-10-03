import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src=new File("E:\\abc.txt");
		File des=new File("E:\\pqr.txt");
		try
		{
			Files.copy(src.toPath(),des.toPath());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
