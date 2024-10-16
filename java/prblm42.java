import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class prblm42 {
    public static void main(String[] args) {
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lengthCompare = Integer.compare(s1.length(), s2.length());
                if (lengthCompare == 0) {
                    return s1.compareTo(s2);
                }
                return lengthCompare;
            }
        };

        Set<String> treeSet = new TreeSet<>(lengthComparator);
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("kiwi");
        treeSet.add("pear");
        treeSet.add("orange");
        treeSet.add("plum");
        System.out.println("Strings sorted by length:");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}

