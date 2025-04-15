import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] solved = {
                {},
                {"A", "B", "C", "D", "E", "F", "G", "H", "J", "L", "M"},
                {"A", "C", "E", "F", "G", "H", "I", "L", "M"},
                {"A", "C", "E", "F", "G", "H", "I", "L", "M"},
                {"A", "B", "C", "E", "F", "G", "H", "L", "M"},
                {"A", "C", "E", "F", "G", "H", "L", "M"},
                {"A", "C", "E", "F", "G", "H", "L", "M"},
                {"A", "C", "E", "F", "G", "H", "L", "M"},
                {"A", "C", "E", "F", "G", "H", "L", "M"},
                {"A", "C", "E", "F", "G", "H", "L", "M"},
                {"A", "B", "C", "F", "G", "H", "L", "M"},
        };

        int rankIdx = Integer.parseInt(br.readLine());

        String[] teamSolved = solved[rankIdx];
        System.out.println(teamSolved.length);
        System.out.println(String.join(" ", teamSolved));

        br.close();
    }
}


