import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Parser {
    private int b;

    private int l;

    private int d;

    File file = new File("C:\\Users\\20182290\\Downloads\\d_tough_choices.txt");

    Scanner scanner;

    public Parser() {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            scanner = new Scanner(System.in);
        }
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
            ArrayList<Integer> bookIDs = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                bookIDs.add(scanner.nextInt());
            }
            lib.add(new Library(t, m, bookIDs, i));
        }
        return lib;
    }

    public int getDays() {
        return d;
    }
}
