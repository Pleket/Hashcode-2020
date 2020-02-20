import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Library> lib;

    ArrayList<Integer> books;

    int days;

    private void run() throws FileNotFoundException {
        parse();
        SoortVanRandom solver = new SoortVanRandom(lib, books, days);
/*        solver.solve();
        lib = solver.getSolution();*/

    }

    private void parse() throws FileNotFoundException {
        Parser parser = new Parser();
        books = parser.getBooks();
        lib = parser.getLibraries();
        days = parser.getDays();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Main solution = new Main();
        solution.run();
    }
}