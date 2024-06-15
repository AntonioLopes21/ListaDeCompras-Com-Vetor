package main;

import implementation.SuperMarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {

    private final static int SIZE = 3;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SuperMarket supermarket = new SupermarketArray(SIZE);

        int opcao;

        do {
            System.out.println("\nLista de compras");
            System.out.println("1 - inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - remover");
            System.out.println("4 - sair");
            System.out.println("Escolha uma opção:");
            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scan.next();
                    supermarket.add(item);
                    break;

                case 2:
                    supermarket.print();
                    break;

                case 3:
                    System.out.println("Digite a posição do item a ser removido: ");
                    int index = scan.nextInt();
                    supermarket.delete(index);
                    break;

                case 4:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente");

            }
        } while (opcao!= 4);

        scan.close();
    }
}
