import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seq = Integer.parseInt(br.readLine());

        if (seq >= 1023) {
            System.out.println(-1);
        }else{
            ArrayList<Long> list = new ArrayList<>(Arrays.asList(0L,1L,2L,3L,4L,5L,6L,7L,8L,9L));
            int digit = 0;
            while (seq > list.size() -1) {
                seq = seq - list.size();

                ArrayList<Long> temp = new ArrayList<>();
                long headNumber = list.get(0) / (int) Math.pow(10,digit) + 1;
                for (long i = headNumber; i <= 9; i++) {
                    long pivot = i *(int) Math.pow(10,digit);
                    for(Long num : list) {
                        if(num < pivot) temp.add(10 * pivot + num);
                        else break;
                    }
                }
                list = temp;
                digit++;
            }
            System.out.println(list.get(seq));
        }
        br.close();
    }
}