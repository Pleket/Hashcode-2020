import java.util.*;

public class Parser {
    private int b;

    private int l;

    private int d;

    private ArrayList<Integer> books;

    Scanner scanner = new Scanner(System.in);

    public Parser() {
        b = scanner.nextInt();
        l = scanner.nextInt();
        d = scanner.nextInt();
    }

    public ArrayList<Integer> getBooks() {
        books = new ArrayList<Integer>();
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
            ArrayList<Integer> bookIDs = new ArrayList<Integer>();

            int value = 0;

            for (int j = 0; j < n; j++) {
                int id = scanner.nextInt();
                bookIDs.add(id);
                value += books.get(id);
            }
            Library libnew = new Library(t, m, bookIDs, i);
            lib.add(libnew);
            //do nothings
            libnew.value = (double) value;
        }
        return lib;
    }

    public int getDays() {
        return d;
    }
}
