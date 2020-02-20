import java.util.*;
import java.io.File;

public class Main {
    ArrayList<Library> lib;

    ArrayList<Integer> books;

    int days;

    private void run() {
        parse();
        RandomSolver solver = new RandomSolver(lib, books, days);
        solver.solve();
        lib = solver.getSolution();
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