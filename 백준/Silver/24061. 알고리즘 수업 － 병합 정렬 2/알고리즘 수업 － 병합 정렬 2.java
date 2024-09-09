import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr;

    public static void arrToString() {
        StringBuffer sb = new StringBuffer();
        for (int item : arr) {
            sb.append(item).append(" ");
        }
        System.out.println(sb);
    }

    static int question;
    static int seq = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input;
        input = br.readLine().split(" ");

        int length = Integer.parseInt(input[0]);
        question = Integer.parseInt(input[1]);
        arr = new int[length];

        input = br.readLine().split(" ");
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        merge_sort(0, arr.length - 1);
        if (question > seq) {
            System.out.println(-1);
        }
    }

    public static void merge_sort(int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2 + 1;
            merge_sort(start, mid - 1);
            merge_sort(mid, end);
            merge(start, mid, end);
        }

    }

    public static void merge(int start, int mid, int end) {

        int[] l_arr = Arrays.copyOfRange(arr, start, mid);
        int[] r_arr = Arrays.copyOfRange(arr, mid, end + 1);

        int arr_index = start;
        int l_arr_index = 0;
        int r_arr_index = 0;

        while (l_arr_index < l_arr.length && r_arr_index < r_arr.length) {
            if (l_arr[l_arr_index] < r_arr[r_arr_index]) {
                arr[arr_index++] = l_arr[l_arr_index++];
            } else {
                arr[arr_index++] = r_arr[r_arr_index++];
            }
            seq++;
            if (seq == question) {
                arrToString();
            }
        }
        while (l_arr_index < l_arr.length) {
            arr[arr_index++] = l_arr[l_arr_index++];
            seq++;
            if (seq == question) {
                arrToString();
            }
        }

        while (r_arr_index < r_arr.length) {
            arr[arr_index++] = r_arr[r_arr_index++];
            seq++;
            if (seq == question) {
                arrToString();
            }
        }
    }
}