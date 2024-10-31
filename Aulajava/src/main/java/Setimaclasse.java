import java.util.Scanner;

public class Setimaclasse {
    public static void main(String[] args) {

        int DiaSemana = 2;
        String NomeDia;

        switch (DiaSemana){
            case 1: NomeDia = "Domingo"; break;
            case 2: NomeDia = "Segunda"; break;
            case 3: NomeDia = "Terça"; break;
            case 4: NomeDia = "Quarta"; break;
            case 5: NomeDia = "Quinta"; break;
            case 6: NomeDia = "Sexta"; break;
            case 7: NomeDia = "Sábado"; break;
            default: NomeDia= "Dia inválido";
        }
        System.out.println(NomeDia);
    }
}
