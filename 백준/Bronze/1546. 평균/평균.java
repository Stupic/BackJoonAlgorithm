import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;

        int count = Integer.parseInt(br.readLine());
        double m = 0;
        String[] subjects = br.readLine().split(" ");

        for (int i = 0; i < count; i++) {
            if (subjects.length < i)
                break;

            if(m <= Double.parseDouble(subjects[i])) m = Double.parseDouble(subjects[i]);
            sum += Double.parseDouble(subjects[i]);
        }


        System.out.println(  ((sum / m) * 100 )/count );
        br.close();
    }

}