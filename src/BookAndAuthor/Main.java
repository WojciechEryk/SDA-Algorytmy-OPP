package BookAndAuthor;


public class Main {

    public static void main(String[] args) {

        Author grey = new Author("Sasha Grey", "sasha.grey@mail.com", 'f');
        Book book = new Book("Hobbit", grey, 20);
        Book book2 = new Book("Hobbit", new Author("Tolkien", "mail",'m'), 20);

    }
}
