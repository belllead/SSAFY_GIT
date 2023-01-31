package test05;

import java.io.File;

public class Test1 {

	public static void main(String[] args) {
		// File Class
		// file 또는 directory의 객체 생성
		File f = new File("big_input.txt");
		System.out.println("이름: " + f.getName());
		System.out.println("path: " + f.getPath());
		System.out.println("directory: " + f.isDirectory());
		System.out.println("file: " + f.isFile());
		System.out.println(f.toString());
		System.out.println(f);
	}
	
}
