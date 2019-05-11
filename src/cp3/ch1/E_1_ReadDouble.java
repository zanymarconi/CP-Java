import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class E_1_ReadDouble {
    public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
    public static final float NaN = 0.0f / 0.0f;
    public static void main(String[] args) throws FileNotFoundException {
        // Approach 1:
        System.setIn(new FileInputStream(new File("./src/cp3/ch1/E_1_ReadDouble.in")));
        System.setOut(new PrintStream(new File("./src/cp3/ch1/E_1_ReadDouble.out")));
        
        System.out.println("Approach 2: Redirect input and output using terminal:\n\t1. javac Main.java\n\t2. java Main < input.in > output.out");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        System.out.println();
        
        System.out.println("P: Reads and prints double w/ 3 decimals and min field width of 7.");
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            Double d = in.nextDouble();
            System.out.printf("%7.3f\n", d);
        }

        System.out.println(POSITIVE_INFINITY);
        System.out.println(NaN);
        in.close();
    }
}