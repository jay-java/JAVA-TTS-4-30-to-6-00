package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P019_FileOutputInputStream {
	public static void main(String[] args) throws IOException {
//		String msg = "this is file handling by file input output stream";
//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		byte[] b  =msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("file written successfully");
		
		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while(( i = fis.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
