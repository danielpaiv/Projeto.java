package ProjetoJava.Daniel;

    public class Cliente {

        public static void main(String args[]) {
            System.out.print("Olá Boa noite");
        }

        private String codigo;
        private String nome;
        private String endereco;

        public String getCodigo() {
            return codigo ;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }
        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void cadastrarEndereco() {
            this.endereco =  " Rua teste";

        }
        public void cadastrarCodigo() {
            this.codigo = " 123";
        }
        public void cadastrarNome() {
            this.nome = " Daniel";
        }
    }