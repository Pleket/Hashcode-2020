import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SoortVanRandom {

    public SoortVanRandom(ArrayList<Library> lib, ArrayList<Integer> books, int days) {

        Collections.sort(lib);

        for (Library l: lib) {
            Collections.sort(l.books, new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return -Integer.compare(books.get(a), books.get(b));
                }
            });

        }


        Solution sol = new Solution(lib, books, days);
        long optimalScore = sol.solve();
        int librariesSigned = sol.curlib;

        Output output = new Output();
        output.output(librariesSigned, lib, sol.noscanned, sol.scannedIds);
        System.out.println(optimalScore);

    }

}
