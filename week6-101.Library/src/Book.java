public class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year){
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }
    public String toString(){
        return this.title + ", "+ this.publisher + ", "+  this.year;
    }
}
