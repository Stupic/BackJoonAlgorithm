import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] hms = br.readLine().split(" ");

        int hours = Integer.parseInt(hms[0]);
        int minutes = Integer.parseInt(hms[1]);
        int seconds = Integer.parseInt(hms[2]);

        int addSeconds = Integer.parseInt(br.readLine());

        // 총 초 계산
        int totalSeconds = hours * 3600 + minutes * 60 + seconds + addSeconds;

        // 새로운 시, 분, 초 계산
        int newHours = (totalSeconds / 3600) % 24; // 24시간 형식으로
        int newMinutes = (totalSeconds % 3600) / 60;
        int newSeconds = totalSeconds % 60;

        // 결과 출력
        System.out.printf("%d %d %d%n", newHours, newMinutes, newSeconds);
        br.close();
    }
}