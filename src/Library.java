import java.util.ArrayList;
import java.util.Collection;

public class Library {
    Collection<Integer> books;
    int days;
    int scannable;

    public Library() { }

    public Library(int t, int m, Collection<Integer> bookIDs) {
        this.days = t;
        this.scannable = m;
        this.books = bookIDs;
    }

}
