import java.util.Scanner;

public class GanheUmBrinde {

    public static void main(String[] args) {
        // Ler o valor do pedido
        Scanner scanner = new Scanner(System.in);
        int valorPedido = scanner.nextInt();

        // Verificar se o valor do pedido é maior ou igual a R$50,00
        if (valorPedido >= 50) {
            // Mensagem de brinde
            System.out.println("Parabens, você ganhou um brinde especial!!!!!.....");
        } else {
            // Mensagem de não brinde
            System.out.println("Que pena, você não ganhou nenhum brinde especial hoje.");
        }
    }
}
