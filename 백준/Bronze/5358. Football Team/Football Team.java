import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        while ((name = br.readLine()) != null && !name.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i< name.length(); i++){
                char c = name.charAt(i);
                if( c == 'E' || c == 'e'){
                    sb.append( (char)(c + 4));
                }else if( c == 'I' || c == 'i') {
                    sb.append( (char)(c - 4));
                }else{
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}