package zifo.com;
import java.util.*;
public class Book {
	String title;
	String author;
	int ISBN;
	public Book(String title,String author,int ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int ISBN) {
		this.ISBN=ISBN;
	}
	public void removeData() {
	       this.title = "";
	       this.author = "";
	       this.ISBN = 0;
	   }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String title = sc.nextLine();
	String author = sc.nextLine();
	int ISBN = sc.nextInt();
	Book mybook = new Book (title,author,ISBN);
	System.out.println("Title :" + mybook.gettitle());
	System.out.println("Author :"+ mybook.getauthor());
	System.out.println("ISBN :"+mybook.getISBN());
	mybook.settitle("Harrypotter");
	mybook.setauthor("JK Rowling");
	mybook.setISBN(1234);
	System.out.println("Updated Title :" + mybook.gettitle());
	System.out.println("Updated Author:"+mybook.getauthor());
	System.out.println("Updated ISBN: "+ mybook.getISBN());
	
	mybook.removeData();
    
	   System.out.println("Removed Title :" + mybook.gettitle());
	   System.out.println("Removed Author :" + mybook.getauthor());
	   System.out.println("Removed ISBN :" + mybook.getISBN());
}
}
