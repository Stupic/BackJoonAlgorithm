import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        CamelCase camelCase = new CamelCase();
        SnakeCase snakeCase = new SnakeCase();
        PascalCase pascalCase = new PascalCase();

        String[] input = br.readLine().split(" ");

        int mode = Integer.parseInt(input[0]);
        String variable = input[1];

        ArrayList<String> words = new ArrayList<>();
        switch (mode){
            case 1:
                words = camelCase.splitWord(variable);
                break;
            case 2:
                words = snakeCase.splitWord(variable);
                break;
            case  3:
                words = pascalCase.splitWord(variable);
                break;
        }

        System.out.println(camelCase.createVariable(words));
        System.out.println(snakeCase.createVariable(words));
        System.out.println(pascalCase.createVariable(words));
    }

    interface VariableCase {
        ArrayList<String> splitWord(String variable);
        String createVariable(ArrayList<String> words);
    }

    static class CamelCase implements VariableCase {

        @Override
        public ArrayList<String> splitWord(String variable) {
            ArrayList<String> words = new ArrayList<>();

            StringBuilder word = new StringBuilder();
            for (int i = 0; i < variable.length(); i++) {
                char c = variable.charAt(i);
                if (i != 0 && Character.isUpperCase(c)) {
                    words.add(word.toString().toLowerCase());
                    word = new StringBuilder();
                }
                word.append(c);
                if(i == variable.length() - 1){
                    words.add(word.toString().toLowerCase());
                }
            }

            return words;
        }

        @Override
        public String createVariable(ArrayList<String> words) {
            StringBuilder variable = new StringBuilder();
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);

                if(i != 0) word = word.substring(0,1).toUpperCase() + word.substring(1);

                variable.append(word);
            }
            return variable.toString();
        }

    }

    static class SnakeCase implements VariableCase {

        @Override
        public ArrayList<String> splitWord(String variable) {
            ArrayList<String> words = new ArrayList<>();

            StringBuilder word = new StringBuilder();
            for (int i = 0; i < variable.length(); i++) {
                char c = variable.charAt(i);
                if (c == '_') {
                    words.add(word.toString().toLowerCase());
                    word = new StringBuilder();
                } else {
                    word.append(c);
                }
                if(i == variable.length() -1){
                    words.add(word.toString().toLowerCase());
                }
            }
            return words;
        }

        @Override
        public String createVariable(ArrayList<String> words) {
            StringBuilder variable = new StringBuilder();
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);

                variable.append(word);

                if (i != words.size() - 1) variable.append('_');
            }
            return variable.toString();
        }

    }

    static class PascalCase implements VariableCase {

        @Override
        public ArrayList<String> splitWord(String variable) {
            ArrayList<String> words = new ArrayList<>();

            StringBuilder word = new StringBuilder();
            for (int i = 0; i < variable.length(); i++) {
                char c = variable.charAt(i);
                if (i != 0 && Character.isUpperCase(c)) {
                    words.add(word.toString().toLowerCase());
                    word = new StringBuilder();
                }
                word.append(c);
                if(i == variable.length() - 1) words.add(word.toString().toLowerCase());
            }
            return words;
        }

        @Override
        public String createVariable(ArrayList<String> words) {
            StringBuilder variable = new StringBuilder();
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                word = word.substring(0,1).toUpperCase() + word.substring(1);
                variable.append(word);
            }
            return variable.toString();
        }
    }
}