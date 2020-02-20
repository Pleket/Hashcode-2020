import java.util.*;

public class Parser {
    int b;

    int l;

    int d;



    Scanner scanner = new Scanner(System.in);

    public Parser() {
        b = scanner.nextInt();
        l = scanner.nextInt();
        d = scanner.nextInt();
    }

    public ArrayList<Integer> getBooks() {
        ArrayList<Integer> books = new ArrayList<Integer>();
        for (int i = 0; i < b; i++) {
            books.add(scanner.nextInt());
        }
        return books;
    }

    public ArrayList<Library> getLibraries() {

    }
}
