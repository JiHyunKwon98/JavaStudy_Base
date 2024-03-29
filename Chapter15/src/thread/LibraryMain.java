package thread;

import java.util.ArrayList;

class FastLibrary{
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("�¹���1");
		books.add("�¹���2");
		books.add("�¹���3");
		books.add("�¹���4");
		books.add("�¹���5");
		books.add("�¹���6");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		
		while(books.size() == 0) {
			System.out.println(t.getName()+"wait start");
			wait();
			System.out.println(t.getName()+"wait end");
		}
		
		String title = books.remove(0);
		System.out.println(t.getName()+":"+title+"lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		notifyAll();
		System.out.println(t.getName()+":"+title+"return");
	}
}

class Student extends Thread{
	
	public void run() {
		
		
		try {
			String title  = LibraryMain.Library.lendBook();
			if (title ==null) return;
			sleep(5000);
			LibraryMain.Library.returnBook(title);
		}catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
}

public class LibraryMain {

	public static FastLibrary Library = new FastLibrary();
	public static void main(String[] args) {
		
		
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		

	}

}
