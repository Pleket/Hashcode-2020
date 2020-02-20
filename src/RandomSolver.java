import java.util.*;

public class RandomSolver {
    ArrayList<Library> lib;

    ArrayList<Integer> books;

    ArrayList<Integer> optimal;

    int optimalScore;

    int days;

    public RandomSolver(ArrayList<Library> lib, ArrayList<Integer> books, int days) {
        this.lib = lib;
        this.books = books;
        this.days = days;
        optimal = new ArrayList<Integer>();
        optimalScore = 0;
    }

    public void solve() {
        Collections.shuffle(lib);
        Solution sol = new Solution(lib, books, days);
    }
}
