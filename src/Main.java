import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Library> lib;

    private void run() {
        parse();
    }

    private void parse() {
        Parser parser = new Parser();

        lib = parser.getLibraries();
    }

    public static void main(String[] args) {
        Main solution = new Main();
        solution.run();
    }
}