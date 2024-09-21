import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        switch (n) {
            case "0":
                System.out.println("1");
                break;
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("6");
                break;
            case "4":
                System.out.println("24");
                break;
            case "5":
                System.out.println("120");
                break;
            case "6":
                System.out.println("720");
                break;
            case "7":
                System.out.println("5040");
                break;
            case "8":
                System.out.println("40320");
                break;
            case "9":
                System.out.println("362880");
                break;
            case "10":
                System.out.println("3628800");
                break;
            case "11":
                System.out.println("39916800");
                break;
            case "12":
                System.out.println("479001600");
                break;
            case "13":
                System.out.println("6227020800");
                break;
            case "14":
                System.out.println("87178291200");
                break;
            case "15":
                System.out.println("1307674368000");
                break;
            case "16":
                System.out.println("20922789888000");
                break;
            case "17":
                System.out.println("355687428096000");
                break;
            case "18":
                System.out.println("6402373705728000");
                break;
            case "19":
                System.out.println("121645100408832000");
                break;
            case "20":
                System.out.println("2432902008176640000");
                break;
        }

        br.close();
    }
}