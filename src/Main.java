import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Library> lib;

    ArrayList<Integer> books;

    private void run() {
        parse();
        Solution sol = new Solution(lib, books);
        sol.solve();
    }

    private void parse() {
        Parser parser = new Parser();
        books = parser.getBooks();
        lib = parser.getLibraries();
    }

    public static void main(String[] args) {
        Main solution = new Main();
        solution.run();
    }
}