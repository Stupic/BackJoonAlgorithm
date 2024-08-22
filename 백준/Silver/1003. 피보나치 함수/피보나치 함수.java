
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<Integer, Fibonacci> fibonacciStore = new HashMap<>();
    public static void main(String[] args) throws IOException {

        Fibonacci initZero = new Fibonacci();
        initZero.setZero(1);
        fibonacciStore.put(0, initZero);
        Fibonacci initOne = new Fibonacci();
        initOne.setOne(1);
        fibonacciStore.put(1, initOne);

        int maxKey = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < t ; i++){
            int n = Integer.parseInt(br.readLine());

            while(n > maxKey){
                setFibonacci(++maxKey);
            }

            Fibonacci f = fibonacciStore.get(n);
            System.out.println(f.toString());
        }
        br.close();
    }

    static void setFibonacci(int n){

        if(!fibonacciStore.containsKey(n)){
            Fibonacci lFibonacci = fibonacciStore.get(n-1);
            Fibonacci rFibonacci = fibonacciStore.get(n-2);

            Fibonacci fibonacci = new Fibonacci();
            fibonacci.setZero(lFibonacci.getZero() + rFibonacci.getZero());
            fibonacci.setOne(lFibonacci.getOne() + rFibonacci.getOne());
            fibonacciStore.put(n, fibonacci);
        }
    }

}

class Fibonacci {
    int zero = 0;
    int one = 0;

    public void setOne(int one) {
        this.one = one;
    }

    public void setZero(int zero) {
        this.zero = zero;
    }

    public int getOne() {
        return one;
    }

    public int getZero() {
        return zero;
    }

    public String toString() {
        return zero + " " + one;
    }
}