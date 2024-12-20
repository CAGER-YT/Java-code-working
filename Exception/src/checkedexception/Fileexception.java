package checkedexception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//public class Fileexception {
//	public static void main(String[] args) throws IOException {
//		File f = new File("C://Users//sandy//OneDrive//Desktop//oops.txt");
//		FileReader x = new FileReader(f);
////		String y="test";
////		FileWriter z=new FileWriter(y);
//		int temp = 0;
//		while ((temp = x.read()) != -1) {
//			System.out.print((char) (temp));
//		}
//	}
//}
public class Fileexception {
    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}

class Filename {
    private String fullPath;
    private char pathSeparator, 
                 extensionSeparator;

    public Filename(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot+1);
    }

    // gets filename without extension
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
}