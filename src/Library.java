import java.util.ArrayList;
import java.util.Collection;

public class Library {
    ArrayList<Integer> books;
    int days;
    int scannable;
    int id;

    public Library(int t, int m, ArrayList<Integer> bookIDs, int id) {
        this.days = t;
        this.scannable = m;
        this.books = bookIDs;
        this.id = id;
    }

}
