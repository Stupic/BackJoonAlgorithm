import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] memes = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean flag = false;
        while (n-- > 0) {
            String meme = br.readLine();

            flag = false;
            for (int i = 0; i < memes.length; i++) {
                if (memes[i].equals(meme)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) break;
        }
        System.out.println(flag ? "No" : "Yes");
        br.close();
    }
}
