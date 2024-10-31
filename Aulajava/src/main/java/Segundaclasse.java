import java.util.Scanner;

public class Segundaclasse {
    public static void main(String[] args) {
//        String nome = "Liliane";
//        int idade = 27;
//        float peso = 62;
//        float altura = 1.57F;

        Scanner dados = new Scanner(System.in);

        System.out.println("O seu nome é: ");
        String nome = dados.nextLine();

        System.out.println("Sua idade é: ");
        int idade = dados.nextInt();

        System.out.println("Meu peso é: " );
        double peso = dados.nextDouble();

        System.out.println("Minha altura é: ");
        double altura = dados.nextDouble();

        System.out.println("Minha altura é: " + nome);
        System.out.println("Minha altura é: " + idade);
        System.out.println("Minha altura é: " + peso);
        System.out.println("Minha altura é: " + altura);

    }
}
