package cp3.ch1;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Collections;

class Birthday {
    private int d, m, y;
    public Birthday(int d, int m, int y) {
        this.d=d; this.m=m; this.y=y;
    }
    public int getD() { return d; }
    public int getM() { return m; }
    public int getY() { return y; }
}

public class E_5_SortBirthday {
    public static void main(String[] args) throws FileNotFoundException {
        // input dd mm yyyy
        // ascending month, then ascending date, then ascending age
        System.setIn(new FileInputStream(new File("./src/cp3/ch1/E_5_SortBirthday.in")));
        System.setOut(new PrintStream(new File("./src/cp3/ch1/E_5_SortBirthday.out")));

        // AbstracMap.SimpleEntry is a static class
        // Map.Entry<Integer, Integer> pair = new AbstractMap.SimpleEntry<Integer, Integer>(1, 2);
        // System.out.println(pair.getKey()+"="+pair.getValue());
        

        List<Birthday> birthdays = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int d, m, y;
            d=sc.nextInt(); m=sc.nextInt(); y=sc.nextInt(); y*=-1;
            birthdays.add(new Birthday(d, m, y));
        }
        System.out.println("Size= "+ birthdays.size());
        Collections.sort(birthdays, Comparator.comparingInt(Birthday::getM)
            .thenComparing(Birthday::getD)
            .thenComparing(Birthday::getY));
        for(Birthday b: birthdays) {
            System.out.println("ordered= "+b.getD()+" "+b.getM()+" "+(-1*b.getY()));
        }
        sc.close();
    }
}