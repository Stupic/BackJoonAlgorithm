
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCnt = 20;
        float creditSum = 0;
        float subjectSum = 0;
        float subjectAvg = 0;

        for (int i = 0; i < subjectCnt; i++) {
            String[] input = br.readLine().split(" ");
            float credit = Float.parseFloat(input[1]);
            String grade = input[2];
            float gradeCredit = 0;

            if (grade.equals("P")) continue;

            if (grade.contains("A")) gradeCredit = 4;
            else if (grade.contains("B")) gradeCredit = 3;
            else if (grade.contains("C")) gradeCredit = 2;
            else if (grade.contains("D")) gradeCredit = 1;
            else if (grade.contains("F")) gradeCredit = 0;

            if (grade.contains("+")) gradeCredit += 0.5F;

            creditSum += credit;
            subjectSum += credit * gradeCredit;
        }

        subjectAvg = creditSum == 0 ? 0 : subjectSum / creditSum ;

        System.out.printf("%.6f%n", subjectAvg);
        br.close();
    }
}