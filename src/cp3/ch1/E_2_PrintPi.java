import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class E_2_PrintPi {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(new File("./src/cp3/ch1/E_2_PrintPi.out")));
            System.setIn(new FileInputStream(new File("./src/cp3/ch1/E_2_PrintPi.in")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }
        sc.close();

        double pi = 2 * Math.acos(0.0);
        for(int n: arr) {
            // for 2 decimal points = %.2f
            String str = "%." + n + "f \n";
            System.out.printf(str, pi);
        }
    }
}