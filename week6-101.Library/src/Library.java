import java.util.ArrayList;

public class Library {
    ArrayList<Book> listOfBooks;
    public Library(){
        this.listOfBooks = new ArrayList<Book>();

    }
    public void addBook(Book newBook){
        listOfBooks.add(newBook);
    }
    public void printBooks(){
        for (Book book:listOfBooks) {
            System.out.println(book.toString());

        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book:listOfBooks) {
            if (book.title().contains(title)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book:listOfBooks) {
            if (book.publisher().contains(publisher)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book:listOfBooks) {
            if (book.year()==year){
                found.add(book);
            }
        }
        return found;
    }



}
