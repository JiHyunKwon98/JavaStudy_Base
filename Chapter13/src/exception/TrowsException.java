package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class TrowsException{
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args){
		
		TrowsException test = new TrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}catch(Exception e){
			//최상위 익셉션은 제일 마지막 
		}
		
		System.out.println("end");
	}

}
