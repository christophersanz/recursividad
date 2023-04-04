import java.util.Scanner;

public class Fibonacci {
    public static int myFunction(int n) {
        if (n == 0 || n == 1) return n;
        return myFunction(n-1) + myFunction(n-2);
    }
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        Integer num = Integer.valueOf(teclado.nextLine());

        System.out.println("Fibonacci de : " +num + " es " + myFunction(num));
        for(int i=0;i<=num;i++){
            System.out.println(myFunction(i));
        }
    }
}

/*
    Fibonacci(0) = 0
    Fibonacci(1) = 1
    Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
    0,1,1,2,3,5,8,13,21,34,55,89

    Fibonacci(6) = Fibonacci(5) + Fibonacci(4) = 5+3=8
    Fibonacci(5) = Fibonacci(4) + Fibonacci(3) = 3+2=5
    Fibonacci(4) = Fibonacci(3) + Fibonacci(2) = 3
    Fibonacci(3) = Fibonacci(2) + 1            = 1+1=2
    Fibonacci(2) = Fibonacci(1) + 0    
*/
