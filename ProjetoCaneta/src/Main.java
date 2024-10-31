//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Canetajava caneta1 = new Canetajava();

        caneta1.modelo = "esferografica";
        caneta1.cor = "azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        //caneta1.tampada = true;

        caneta1.destampar();
        caneta1.estado();
        caneta1.rabiscar();
        caneta1.desenhar();
        caneta1.pintar();



       }
}