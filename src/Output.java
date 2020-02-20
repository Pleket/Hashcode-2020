import java.util.*;

public class Output {
    public void output(int librariesSigned, ArrayList<Library> lib, ArrayList<Integer> bookAmounts, ArrayList<ArrayList<Integer>> bookIDs) {
        System.out.println(librariesSigned);
        for (int i = 0; i < librariesSigned; i++) {
            int id = lib.get(i).id;
            System.out.println(lib.get(i).id + " " + bookAmounts.get(id));
            for (int j = 0; j < bookAmounts.get(id) - 1; j++) {
                System.out.print(bookIDs.get(id).get(j) + " ");
            }
            System.out.println(bookIDs.get(id).get(bookIDs.get(id).size()) - 1);
        }
    }
}
