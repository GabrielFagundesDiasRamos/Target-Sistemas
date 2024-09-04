import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que informe a string a ser invertida
        System.out.println("Digite a string a ser invertida:");
        String original = scanner.nextLine();
        
        // Fecha o scanner
        scanner.close();
        
        // Inverte a string
        String invertida = inverter(original);
        
        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);
    }

    // Método para inverter a string
    public static String inverter(String str) {
        char[] caracteres = str.toCharArray(); // Converte a string em um array de caracteres
        int esquerda = 0; // Índice do início
        int direita = caracteres.length - 1; // Índice do final
        
        // Troca os caracteres do início com os do final até chegar ao meio
        while (esquerda < direita) {
            // Troca os caracteres
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            
            // Move os índices para o centro
            esquerda++;
            direita--;
        }
        
        // Converte o array de caracteres de volta para uma string
        return new String(caracteres);
    }
}
