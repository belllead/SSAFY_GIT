package test01_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// byte stream
		// => 이미지
		
				
		// 여기서는 예외 처리는 따로 하지 않음
		// try with resource
		// try 다음에 (), ()안에 필요한 리소스를 정의
		// 문장은 ;으로 구분
		// close를 따로 할 필요없이 알아서 close 해줌
		try (FileInputStream in = new FileInputStream("newjeans.jpg");
			FileOutputStream out = new FileOutputStream("newjeans-copy2.jpg")) {
			int b; // byte를 int형으로 지정해도 됨
			
			while((b = in.read()) != -1) {
				out.write(b);
			}
			System.out.println("copy complete");			
			System.out.println("stream closes automatically");
		}
		
	}
	
}
