import java.util.*;

public class Parser {
    private int b;

    private int l;

    private int d;

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
        ArrayList<Library> lib = new ArrayList<Library>();
        for (int i = 0; i < l; i++) {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            int m = scanner.nextInt();
            Collection<Integer> bookIDs = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                bookIDs.add(scanner.nextInt());
            }
            lib.add(new Library(t, m, bookIDs));
        }
        return lib;
    }

    public int getDays() {
        return d;
    }
}
