import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        for (int i = 0; i < 3; i++) {
            String[] record = br.readLine().split(" ");
            String inTime = String.join(":", record[0], record[1], record[2]);
            String outTime = String.join(":", record[3], record[4], record[5]);
            System.out.println(getWorkHms(inTime, outTime, format));
        }
    }

    static String getWorkHms(String in, String out, SimpleDateFormat format) throws ParseException {
        long diff = format.parse(out).getTime() - format.parse(in).getTime();
        return String.format("%d %d %d",
                (diff / (1000 * 60 * 60)) % 24,
                (diff / (1000 * 60)) % 60,
                (diff / 1000) % 60
        );
    }
}