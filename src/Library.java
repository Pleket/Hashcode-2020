import java.util.ArrayList;
import java.util.Collection;

public class Library implements Comparable {
    ArrayList<Integer> books;
    int days;
    int scannable;
    int id;

    public double value;

    public Library(int t, int m, ArrayList<Integer> bookIDs, int id) {
        this.days = t;
        this.scannable = m;
        this.books = bookIDs;
        this.id = id;
    }

    @Override
    public int compareTo(Object obj) {
        Library comp = (Library) obj;
        return -Double.compare(this.value / this.days, comp.value / comp.days);
    }

}
