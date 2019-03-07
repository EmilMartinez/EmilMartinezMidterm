package datastructure;
/*
 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 * Store all the sorted data into one of the databases.
 *
 */
import java.util.ArrayList;
import java.util.List;


public class UseArrayList {
    // insertDataFromIntArrayListToSqlTable();


	public static void main(String[] args) {
        List<Integer> anika = new ArrayList<Integer>();
        anika.add(7);
        anika.add(5);
        anika.add(3);
        anika.add(9);
        anika.add(8);

        anika.add(0,7);
        anika.add(1,5);
        anika.add(2,3);
        anika.add(3,3);
        anika.add(4,9);
        anika.add(5,8);

        anika.get(0);
        anika.get(1);
        anika.get(2);
        anika.get(3);
        anika.get(4);

        anika.remove(7);
        anika.remove(5);
        anika.remove(3);
        anika.remove(9);
        anika.remove(8);

        int peek = anika.get(0);
        int know = anika.get(1);
        int jet = anika.get(2);
        int have = anika.get(3);
        int yes = anika.get(4);




	}

}
