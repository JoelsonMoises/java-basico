package mercado;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    List<Item> itens = new ArrayList<>();

    public NotaFiscal(List<Item> itens) {
        this.itens = itens;
    }

    double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    void exibirNota() {
        System.out.println("===== Nota Fiscal =====");
        for (Item item : itens) {
            System.out.println(item.produto.nome + " - Quantidade: " + item.quantidade + " - Subtotal: R$"
                    + item.calcularSubtotal());
        }
        System.out.println("=======================");
        System.out.println("Total: R$" + calcularTotal());
    }
}
