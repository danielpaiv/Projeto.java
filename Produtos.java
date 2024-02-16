package ProjetoJava.Daniel;

public class Produtos {

    private String produto;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    // Aqui fica os valores dos informações
    public void cadastrarProduto() {
        this.produto = "Geladeira";
    }
}
