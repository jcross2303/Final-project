import java.util.Comparator;

public class Mycomparator implements Comparator {

    public int compare(Object o1, Object o2) {
        WebTree p1 = (WebTree) o1;
        WebTree p2 = (WebTree) o2;
        if (p1.score < p2.score) return 1;
        else return 0;
    }

}