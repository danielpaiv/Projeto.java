package ProjetoJava.Daniel;

    public class Produtos {
        public static void main(String args[]) {
            System.out.print("Olá Daniel");
        }
        private String produto;

        public String getProduto() {
            return produto;
        }

        public void setProduto(String produto) {
            this.produto = produto;
        }
        public void cadastrarProduto(){
            this.produto = "Geladeira";
        }
    }
