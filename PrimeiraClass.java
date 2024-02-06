package ProjetoJava.Daniel;


    //Class pricipal //
    public class PrimeiraClass {
            public static void main(String aegs[]) {
                //System.out.print("Olá Daniel");

                //Esse conjunto de codigo faz a leitura das class e puxa para a class primária //
                Cliente cliente = new Cliente();
                Produtos produto = new Produtos();
                Fucionario fucionario = new Fucionario();
                Itenvenda itenvenda = new Itenvenda();
                Venda venda = new Venda();

                //Aqui fica o código os valores das variaveis //
                cliente.cadastrarCodigo();
                cliente.cadastrarEndereco();
                cliente.cadastrarNome();
                cliente.cadastrarValor();
                produto.cadastrarProduto();
                fucionario.cadastrarCodigo();
                fucionario.cadastrarNome();
                fucionario.cadastrarEndereco();
                itenvenda.cadastrarQuantidade();
                venda.cadastrarTotal();

                //Esse código e´responsável para imprimir os valores no conssole //
                System.out.println(cliente.getCodigo());
                System.out.println(cliente.getNome());
                System.out.println(cliente.getEndereco());
                System.out.println(produto.getProduto());
                System.out.println(cliente.getValor());
                System.out.println(fucionario.getNome());
                System.out.println(fucionario.getCodigo());
                System.out.println(fucionario.getEndereco());
                System.out.println(itenvenda.getQuantidade());
                System.out.println(venda.getTotal());


            }
    }

