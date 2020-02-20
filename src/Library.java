import java.util.ArrayList;
import java.util.Collection;

public class Library {
    ArrayList<Integer> books;
    int days;
    int scannable;

    public Library(int t, int m, ArrayList<Integer> bookIDs) {
        this.days = t;
        this.scannable = m;
        this.books = bookIDs;
    }

}
