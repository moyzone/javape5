import java.util.Set;
import java.util.TreeSet;

public class sortusingset {
    public void SetSort(){
        Set<String> stringSet=new TreeSet<>();
        stringSet.add("Harry");
        stringSet.add("Olive");
        stringSet.add("Alice");
        stringSet.add("Bluto");
        stringSet.add("Eugene");
        System.out.println(stringSet);
    }

    public static void main(String[] args) {
        sortusingset sortUsingSet=new sortusingset();
        sortUsingSet.SetSort();
    }
}