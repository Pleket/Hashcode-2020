import java.util.*;

public class RandomSolver {
    ArrayList<Library> lib;

    int librariesSigned;

    ArrayList<Integer> books;

    //ArrayList<Integer> optimal;

    long optimalScore;

    int days;

    public RandomSolver(ArrayList<Library> lib, ArrayList<Integer> books, int days) {
        this.lib = lib;
        this.books = books;
        this.days = days;
        //optimal = new ArrayList<Integer>();
        optimalScore = 0;

    }

    public void solve() {
        Collections.shuffle(lib);

        /* Also shuffle books. */
        for (Library l: lib) {
            Collections.shuffle(l.books);
        }

        Solution sol = new Solution(lib, books, days);
        optimalScore = sol.solve();
        librariesSigned = sol.curlib;
    }

    public ArrayList<Library> getSolution() {
        return lib;
    }
}
