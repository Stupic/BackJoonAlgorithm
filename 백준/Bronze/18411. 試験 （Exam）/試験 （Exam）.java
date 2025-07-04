import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        List<Integer> list  = Arrays.stream(inputs).map(Integer::parseInt)
                        .sorted().collect(Collectors.toList());
        System.out.println(list.get(1)  + list.get(2));

        br.close();
    }

}