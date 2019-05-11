package basics;

import java.io.PrintStream;
import java.math.BigInteger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class BaseXtoY {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(new File("./src/basics/BaseXtoY.in")));
        System.setOut(new PrintStream(new File("./src/basics/BaseXtoY.out")));

        int X, Y;
        String inp, out;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            X = sc.nextInt();
            inp = sc.next();
            Y = sc.nextInt();

            Long temp = Long.parseLong(inp, X);
            out = Long.toString(temp, Y);
            System.out.println(X+" = "+inp+"\n"+Y+" = "+out.toUpperCase()+"\n");
        }
        sc.close();
    }
}