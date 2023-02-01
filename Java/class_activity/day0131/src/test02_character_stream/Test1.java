package test02_character_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// chatacter stream => reader, write
		try (FileReader reader = new FileReader("big_input.txt");
			FileWriter writer = new FileWriter("big_input-copy.txt")) {
			int c; // character를 int에 담아도
			
			while ((c = reader.read()) != -1) {
				writer.write(c);
			}
			System.out.println("copy complete");
			System.out.println("try with resource 구문으로 알아서 정리됨");
		}
	}
	
}
