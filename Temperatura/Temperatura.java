import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temperatura;
        double soma = 0;
        int contador = 0;

        while (contador < 12) {

            System.out.print("Digite a temperatura " + (contador + 1) + ": ");
            temperatura = entrada.nextDouble();

            if (temperatura < 4 || temperatura > 10) {
                System.out.println("Temperatura inválida! Digite um valor entre 4 e 10 ºC.");
            } else {
                soma = soma + temperatura;
                contador++;
            }
        }

        double media = soma / 12;

        System.out.println("A média de hoje das temperaturas é: " + media + " ºC");

        entrada.close();
    }
}