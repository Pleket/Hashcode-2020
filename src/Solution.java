import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    HashSet<Integer> scannedBooks = new HashSet<>();

    ArrayList<Library> libs;
    ArrayList<Integer> scores;
    int days;

    long score;

    ArrayList<Integer> bookpos;

    int curlib = 0;
    int day = 0;

    public Solution(ArrayList<Library> libs, ArrayList<Integer> bookscores, int days) {
        this.libs = libs;
        this.scores = bookscores;
        this.days = days;
        bookpos = new ArrayList<>(libs.size());
    }

    public long solve() {

        Library current = libs.get(curlib);

        int daysuntiladded = current.days - 1;

        for (int day = 0; day < days; day++) {

            for (int i = 0; i < curlib; i++) {

                //if (i >= libs.size()) { break; }
                Library now = libs.get(i);

                int pos = bookpos.get(i); // current book to scan for library i.

                for (int b = 0; b < now.scannable; b++) {

                    if (pos + b < now.books.size()) {
                        int book = now.books.get(pos + b);

                        if (scannedBooks.contains(book)) { pos++; b--; continue; }

                        score += scores.get(book);

                    } else {break;}

                }


            }


            if (daysuntiladded == 0) {
                curlib += 1;

                if (curlib < libs.size()) {
                    current = libs.get(curlib);
                    daysuntiladded = current.days;
                }

            }

            daysuntiladded -= 1;

        }

        return score;


    }
}
