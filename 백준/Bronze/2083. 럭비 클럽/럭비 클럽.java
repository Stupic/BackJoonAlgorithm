import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<String, Integer>[] items;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = br.readLine()).equals("# 0 0")) {
            String[] split = input.split(" ");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            int weight = Integer.parseInt(split[2]);
            System.out.println(name + " " + (age > 17 || weight >= 80 ? "Senior" : "Junior"));
        }
        br.close();
    }
}
