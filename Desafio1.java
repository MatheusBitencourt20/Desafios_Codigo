import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        boolean temPar = false;
        boolean temImpar = false;
        boolean temNegativo = false;

        for (int i = 0; i < quantidade; i++) {

            int numero = scanner.nextInt();

            if (numero < 0) {
                temNegativo = true;
            }
            if (numero %2 == 0){
                temPar = true;
            } else {
                temImpar = true;
            }

            // TODO: atualize temPar ou temImpar de acordo com a paridade de numero.
            // Dica: use o resto da divisao por 2 para decidir.
        }

        if (temNegativo) {
            System.out.println("invalida");
        } else if (temPar && temImpar) {
            System.out.println("equilibrada");
        } else {
            System.out.println("incompleta");
        }

        scanner.close();
    }
}