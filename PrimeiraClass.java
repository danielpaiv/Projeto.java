package ProjetoJava.Daniel;

//Class pricipal //
public class PrimeiraClass {
    public static void main(String aegs[]) {
        // System.out.print("Olá Daniel");

        // Esse conjunto de codigo faz a leitura das class e puxa para a class primária
        // //
        Cliente cliente = new Cliente();
        Produtos produto = new Produtos();
        Vendedor vendedor = new Vendedor();
        Itenvenda itenvenda = new Itenvenda();
        Venda venda = new Venda();

        // Aqui fica o código os valores das variaveis //
        cliente.cadastrarCodigo();
        cliente.cadastrarEndereco();
        cliente.cadastrarNome();
        cliente.cadastrarValor();
        produto.cadastrarProduto();
        vendedor.cadastrarCodigo();
        vendedor.cadastrarNome();
        vendedor.cadastrarEndereco();
        itenvenda.cadastrarQuantidade();
        venda.cadastrarTotal();


        // Esse código e´responsável para imprimir os valores no conssole //
        System.out.println("Codigo:  " + cliente.getCodigo());
        System.out.println("Cliente:  " + cliente.getNome());
        System.out.println("Edereço:  " + cliente.getEndereco());
        System.out.println("Produto:  " + produto.getProduto());
        System.out.println("Valor:  " + cliente.getValor());
        System.out.println("Vendedor:  " + vendedor.getNome());
        System.out.println("Codigo:  " + vendedor.getCodigo());
        System.out.println("Edereço:  " + vendedor.getEndereco());
        System.out.println("Quatidade:  " + itenvenda.getQuantidade());
        System.out.println("Total:  " + venda.getTotal());

    }
}
