import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Library library = new Library();
        while(true){

            System.out.println("======Library Menu======");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.println("6. Choose option");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                            sc.nextLine();

                    System.out.println("Enter Title:");
                    String title = sc.nextLine();

                    System.out.println("Enter Author");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.println("Enter Book ID to remove");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;

                case 3:
                    System.out.println("Enter Title to search");
                    String searchTitle = sc.nextLine();
                    library.searchBook(searchTitle);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
