package mercado;

public class Item {
    Produto produto;
    int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    double calcularSubtotal() {
        return produto.preco * quantidade;
    }
}
