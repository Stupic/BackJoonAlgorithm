import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time1 = br.readLine().split(":");
        String[] time2 = br.readLine().split(":");

        int[] t1 = {Integer.parseInt(time1[0].trim()),Integer.parseInt(time1[1].trim()),Integer.parseInt(time1[2].trim())};
        int[] t2 = {Integer.parseInt(time2[0].trim()),Integer.parseInt(time2[1].trim()),Integer.parseInt(time2[2].trim())};

        System.out.println(calcDiffInSeconds(t1, t2));
        br.close();
    }

    public static int toSeconds(int[] t) {
        return t[0] * 3600 + t[1] * 60 + t[2];
    }

    public static int calcDiffInSeconds(int[] start, int[] end) {
        int startSec = toSeconds(start);
        int endSec = toSeconds(end);

        if (endSec >= startSec) {
            return endSec - startSec;
        } else {
            // 자정을 넘긴 경우: 다음 날로 간주
            return (24 * 3600 - startSec) + endSec;
        }
    }
}
