import java.util.Scanner;

public class Quintaclasse {
    public static void main(String[] args) {

//        usuario entra com quatros notas entregar a media das 4 notas

        Scanner notas = new Scanner(System.in);

        System.out.println("Digita primeira nota");
        int nota1 = notas.nextInt();

        System.out.println("Digita segunda nota");
        int nota2 = notas.nextInt();

        System.out.println("Digita terceira nota");
        int nota3 = notas.nextInt();

        System.out.println("Digita quarta nota");
        int nota4 = notas.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media é: " + media );


        if(media >= 6){
            System.out.println("Está aprovado");
        } else if (media >= 5){
            System.out.println("Está de recuperação");
        } else {
            System.out.println("Está reprovado");
        }
    }
}
