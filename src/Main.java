import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Library> lib;

    ArrayList<Integer> books;

    int days;

    private void run() {
        parse();
        RandomSolver solver = new RandomSolver(lib, books, days);
        solver.solve();
    }

    private void parse() {
        Parser parser = new Parser();
        books = parser.getBooks();
        lib = parser.getLibraries();
        days = parser.getDays();
    }

    public static void main(String[] args) {
        Main solution = new Main();
        solution.run();
    }
}