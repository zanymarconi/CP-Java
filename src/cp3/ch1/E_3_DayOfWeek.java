import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class E_3_DayOfWeek {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(new File("./src/cp3/ch1/E_3_DayOfWeek.in")));
        System.setOut(new PrintStream(new File("./src/cp3/ch1/E_3_DayOfWeek.out")));

        Map<String, Integer> month = new HashMap<>();
        month.put("Jan", 0); month.put("Feb", 1); month.put("Mar", 2); month.put("Apr", 3);
        month.put("May", 4); month.put("Jun", 5); month.put("Jul", 6); month.put("Aug", 7);
        month.put("Sep", 8); month.put("Oct", 9); month.put("Nov", 10); month.put("Dec", 11);
        String[] names = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        Scanner sc = new Scanner(System.in);
        
        // Multiple Delimiters for Scanner
        sc.useDelimiter("-|\\n");
        while(sc.hasNext()) {
            int d = sc.nextInt();
            String s = sc.next();
            int m = month.get(s);
            int y = sc.nextInt();
            Calendar calendar = new GregorianCalendar(y, m, d);
            System.out.printf("%d-%s-%d = %s \n", d, s, y, names[calendar.get(Calendar.DAY_OF_WEEK)]);
        }
        sc.close();
    }
}