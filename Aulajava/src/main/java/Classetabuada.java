import java.util.Scanner; // importando a classe scanner

public class Classetabuada {
    public static void main(String[] args) {

        Scanner numero1 = new Scanner(System.in); // instaciando a classa Scanner
        System.out.println("Digita um numero para gerar a tabuada");

        int numero = numero1.nextInt(); //deixando as variaveis do mesmo tipo

        System.out.println(numero + "x1:" + numero * 1);
        System.out.println(numero + "x3:" + numero * 3);
        System.out.println(numero + "x4:" + numero * 4);
        System.out.println(numero + "x5:" + numero * 5);
        System.out.println(numero + "x6:" + numero * 6);
        System.out.println(numero + "x7:" + numero * 7);
        System.out.println(numero + "x8:" + numero * 8);
        System.out.println(numero + "x9:" + numero * 9);
        System.out.println(numero + "x10:" + numero * 10);


    }
}
