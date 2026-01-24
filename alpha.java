import java.util.*;

public class alpha {
    public static void main(String[] args) {

        String[] names = {"Zara", "Amit", "John", "Kiran"};

        Arrays.sort(names);

        System.out.print("Names in Sorted Order: ");
        for (int i = 0; i < names.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(names[i]);
        }
    }
}
