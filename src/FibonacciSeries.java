import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n<=1){
            return n;
        }
        else{
            return fibonacci(n -1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTerms = scanner.nextInt();
        for (int i = 0; i < numTerms; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
