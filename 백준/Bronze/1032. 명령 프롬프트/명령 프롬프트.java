
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        for(int i = 1 ; i < size ; i++){
            String str = br.readLine();
            pattern = getPattern(pattern, str);
        }
        System.out.println( pattern);
        br.close();
    }


    private static String getPattern (String str1, String str2) {
        final char questionMar = '?';
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < str1.length() ; i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if( ch1 == questionMar ||  ch1 != ch2){
                result.append(questionMar);
            }else {
                result.append(ch1);
            }
        }
        return result.toString();
    }
}