import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books=new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully");
    }
    public void removeBook(int id){
        boolean removed = books.removeIf(book -> book.getId()==id);
        if(removed) {
            System.out.println("Book removed successfully");
        }
        else {
            System.out.println("Book not found");
        }
    }
    public void searchBook(String title){
        boolean found = false;
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
    }
    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("Library is empty");
        }
        else {
            for(Book book : books){
                System.out.println(book);
            }
        }
    }
}
