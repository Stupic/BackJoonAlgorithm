import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int question;
    static int seq = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input;
        input = br.readLine().split(" ");

        int length = Integer.parseInt(input[0]);
        question = Integer.parseInt(input[1]);

        int[] arr = new int[length];
        input = br.readLine().split(" ");

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        arr = merge_sort(arr);
        if (question > seq) {
            System.out.println(-1);
        }
    }

    public static int[] merge_sort(int[] arr) {

        if (arr.length > 1) {
            int pivot = arr.length % 2 == 0 ? arr.length / 2 : arr.length / 2 + 1 ;
            
            int[] l_arr = merge_sort(Arrays.copyOfRange(arr, 0, pivot));
            int[] r_arr = merge_sort(Arrays.copyOfRange(arr, pivot, arr.length));

            arr = merge(l_arr, r_arr);
        }
        return arr;
    }

    public static int[] merge(int[] l_arr, int[] r_arr) {
        int[] arr = new int[l_arr.length + r_arr.length];
        int l_index = 0;
        int r_index = 0;
        int arr_index = 0;
        while (l_index < l_arr.length || r_index < r_arr.length) {
            int value;
            if (l_index == l_arr.length) {
                value = r_arr[r_index++];
            } else if (r_index == r_arr.length) {
                value = l_arr[l_index++];
            } else if (l_arr[l_index] < r_arr[r_index]) {
                value = l_arr[l_index++];
            } else {
                value = r_arr[r_index++];
            }
            arr[arr_index++] = value;
            if (++seq == question) {
                System.out.println(value);
            }
        }

        return arr;
    }
}