package ProjetoJava.Daniel;

public class Fucionario {
    public static void main(String args[]) {
        System.out.print("Olá Boa tarde");
    }
    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarNome(){
        this.nome = "Thiago";
    }
    public void  cadastrarCodigo(){
        this . codigo= (14265);
    }
    public void cadastrarEndereco(){
        this.endereco = "Rua Tupi";
    }
}
