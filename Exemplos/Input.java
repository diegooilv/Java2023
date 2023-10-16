import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo: ");
        
        // Leia uma linha de texto da entrada do usuário
        String userInput = scanner.nextLine();

        // Exiba o que foi digitado
        System.out.println("Você digitou: " + userInput);

        // Não se esqueça de fechar o Scanner quando não precisar mais dele
        scanner.close();
    }
}
