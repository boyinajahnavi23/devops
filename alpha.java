import java.util.*;

public class alpha {
    public static void main(String[] args) {

        int n;
        String temp;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of names you want to enter: ");
        n = s.nextInt();
        s.nextLine(); // consume leftover newline

        String[] names = new String[n];

        System.out.println("Enter all the names:");
        for (int i = 0; i < n; i++) {
            names[i] = s.nextLine();
        }

        // Sorting names alphabetically
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.print("Names in Sorted Order: ");
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(names[i]);
        }

        s.close();
    }
}
