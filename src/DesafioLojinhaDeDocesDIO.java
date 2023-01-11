import java.util.Scanner;

public class DesafioLojinhaDeDocesDIO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        int quantidadeDoces = dinheiro * 2;

        System.out.println("O cliente obteve " + quantidadeDoces + " doces");

    }
}
