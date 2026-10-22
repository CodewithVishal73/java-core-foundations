import java.util.Scanner;
class Book{
	 String author;
	 String title;
	 Book(String author, String title){
		this.author=author;
		this.title=title;
	 }
}
class Store{
	  Book[] books;
	  int count;
	  Store(int size){
		books= new Book[size];
		count=0;
	  }
	  void addbook(Book book){
		  if(count<books.length){
		            books[count++]=book;
		  }
		  else{
			System.out.println("Store is Full");
		  }
	  }

	  void display(){
		for(int i=0;i<count;i++){
			Systerm.out.println("_____________________________________");
			System.out.println("Book "+(i+1)+" : "+books[i].title+" By "+books[i].author);
		}
	  }
}
public class bookstore{
		public static void main(String [] args){
			   Scanner s= new Scanner(System.in);
			   System.out.println("enter number of books :");
			   int n= s.nextInt();
			   s.nextLine();
		           Store st= new Store(n);
			   for(int i=0;i<n;i++){
			   		System.out.println("enter author of book :");
			   		String author= s.nextLine();
					System.out.println("enter Title of book :");
			   		String title= s.nextLine();
					st.addbook(new Book(author,title));
			   }
			   st.display();
			   s.close();
		}
}