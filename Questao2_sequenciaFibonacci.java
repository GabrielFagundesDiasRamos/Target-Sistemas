import java.util.Scanner;

public class FibonacciChecker {

    // Função para verificar se um número pertence à sequência de Fibonacci
    public static boolean pertenceAFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int a = 0, b = 1;
        if (num == a || num == b) {
            return true;
        }

        int c = a + b;
        while (c <= num) {
            if (c == num) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe um número
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
