import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E_4_DistinctSortedArr {

    // generics with wildcard
    private static void printList(List<? extends Number> arr) {
        arr.stream().forEach(x -> System.out.print(x + " "));
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("./src/cp3/ch1/E_4_DistinctSortedArr.out")));

        int n;
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<10; i++) {
            // generate random number between [1-20]
            n = (int) (Math.random() * 20 + 1);
            arr.clear();
            while(n-- > 0) arr.add((int)(Math.random()*9));
            
            System.out.printf("Original (%d) = ", arr.size());
            printList(arr);
            System.out.println();

            System.out.print("Distinct Sorted = ");
            
            // Distinct and sorted array is collected
            arr = arr.stream().distinct().sorted().collect(Collectors.toList());
            printList(arr);
            System.out.printf(" (%d)\n\n", arr.size());
        }
    }
}