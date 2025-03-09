import java.util.Scanner;

public class area {
    public static void main(String[] args) {

        //Calcula a área de um retângulo//

        double altura = 0;
        double largura = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Forneça a altura do retângulo: ");
        altura = scanner.nextDouble();

        System.out.print("Forneça a largura do retângulo: ");
        largura = scanner.nextDouble();

        area = altura * largura;

        System.out.println("A área do retângulo é: " + area + "m²");
    
        scanner.close();

    }
    
}
