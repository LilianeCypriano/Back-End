import java.util.Scanner;

public class Sextaclasse {
    public static void main(String[] args) {

        Scanner imc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = imc.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso =  imc.nextDouble();

        double ap = peso / (altura*altura);

        System.out.println("Seu imc é :" + ap);

        if(ap <= 18.5){
            System.out.println("Está abaixo do peso");
        } else if ((ap>=18.6) && (ap<=24.9)){
            System.out.println("Está no peso ideal");
        } else if (ap <= 29.9){
            System.out.println("Está levemente acima do peso");
        }  else if (ap <= 34.9){
        System.out.println("Obesidade grau I");
        }  else if (ap <= 39.9){
        System.out.println("Obesidade grau II");
        }  else {
        System.out.println("Obesidade grau III");
        }
    }
}
