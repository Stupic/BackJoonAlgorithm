import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.printf("%02d%n", today.getMonthValue());
        System.out.println(today.getDayOfMonth());
    }
    
}