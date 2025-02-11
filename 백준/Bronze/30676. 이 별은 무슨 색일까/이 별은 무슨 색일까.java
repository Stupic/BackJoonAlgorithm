import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String color;
        int wavelength = Integer.parseInt(br.readLine());

        if (wavelength >= 620 && wavelength <= 780) {
            color = "Red";
        } else if (wavelength >= 590 && wavelength < 620) {
            color = "Orange";
        } else if (wavelength >= 570 && wavelength < 590) {
            color = "Yellow";
        } else if (wavelength >= 495 && wavelength < 570) {
            color = "Green";
        } else if (wavelength >= 450 && wavelength < 495) {
            color = "Blue";
        } else if (wavelength >= 425 && wavelength < 450) {
            color = "Indigo";
        } else if (wavelength >= 380 && wavelength < 425) {
            color = "Violet";
        } else {
            color = "알 수 없는 색상";
        }

        System.out.println(color);
        br.close();
    }
}