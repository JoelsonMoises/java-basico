package mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperMercado {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 5.99);
        Produto feijao = new Produto("Feijão", 3.99);
        Produto leite = new Produto("Leite", 2.49);

        List<Item> itens = new ArrayList<>();
        NotaFiscal notaFiscal = new NotaFiscal(itens);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione um produto (1: Arroz, 2: Feijão, 3: Leite, 0: Finalizar): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out.println("Quantidade: ");
            int quantidade = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Item itemArroz = new Item(arroz, quantidade);
                    itens.add(itemArroz);
                    break;
                case 2:
                    Item itemFeijao = new Item(feijao, quantidade);
                    itens.add(itemFeijao);
                    break;
                case 3:
                    Item itemLeite = new Item(leite, quantidade);
                    itens.add(itemLeite);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        notaFiscal.exibirNota();
    }
}
