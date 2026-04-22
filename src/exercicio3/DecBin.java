package exercicio3;

import pilhas.PilhaInt;

import java.util.Scanner;

public class DecBin {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int valorBase10, resto;
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        System.out.print("Valor em decimal: ");
        valorBase10 = le.nextInt();
        while (valorBase10!=0){
            resto = valorBase10 % 2;
            pilha.push(resto);
            valorBase10 = valorBase10 / 2;
        }
        System.out.println("Valor em binário");
        pilha.esvazia();

    }
}
