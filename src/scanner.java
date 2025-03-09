import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        ////////////////////////////////////////////////////////////////////
        //Entrada de dados: como ler Strings, inteiros, doubles e booleanos
        ///////////////////////////////////////////////////////////////////
        
        System.out.print("Enter your name: ");
        // next line lê espaços na string, next() não lê espaços
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //funciona como o cin.ignore() do C++
        //limpa o buffer do teclado

        System.out.print("Enter your height: (in meters) ");
        double height = scanner.nextDouble();

        System.out.print("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("You are " + height + "m tall");

        if (isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT a student");
        }

        scanner.close();

    }

}
