import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String birthY = input[3];
            String birthM = String.format("%2s", input[2]).replace(" ", "0");
            String birthD = String.format("%2s", input[1]).replace(" ", "0");
            String birth = birthY + "/" + birthM + "/" + birthD;

            Person person = new Person(name, birth);
            people.add(person);
        }

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Long.compare(p1.age, p2.age);
            }
        });

        System.out.println(people.get(0).name);
        System.out.println(people.get(cnt - 1).name);

    }

}

class Person {
    String name;
    String birth;
    long age;

    public Person(String name, String birth) throws ParseException {
        this.name = name;
        this.birth = birth;
        Date today = new Date();
        Date birthDate = new SimpleDateFormat("yyyy/MM/dd").parse(birth);
        this.age = today.getTime() - birthDate.getTime();
    }

    @Override
    public String toString() {
        return name + ": " + age + " years";
    }
}