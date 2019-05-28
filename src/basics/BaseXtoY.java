import java.io.PrintStream;
import java.math.BigInteger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class BaseXtoY {

    public void process() throws FileNotFoundException {
        System.setIn(new FileInputStream(new File("BaseXtoY.in")));
        System.setOut(new PrintStream(new File("BaseXtoY.out")));

        int X, Y;
        String in;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            X = sc.nextInt();
            in = sc.next();
            Y = sc.nextInt();
            BigInteger temp = new BigInteger(in, X);
            String out = temp.toString(Y);
            System.out.println(X+" = "+in+"\n"+Y+" = "+out.toUpperCase()+"\n");
        }

        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        BaseXtoY b = new BaseXtoY();
        b.process();
    }
}