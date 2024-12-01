import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = 2009;
        String[] md = br.readLine().split(" ");
        int month = Integer.parseInt(md[1]);
        int day = Integer.parseInt(md[0]);

        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String result = dayOfWeek.toString().substring(0, 1).toUpperCase() + dayOfWeek.toString().substring(1).toLowerCase();
        System.out.println(result);

        br.close();
    }
}