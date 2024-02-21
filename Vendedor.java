package ProjetoJava.Daniel;

public class Vendedor {

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

    // Aqui fica os valores dos informações
    public void cadastrarNome() {
        this.nome = "Thiago";
    }

    public void cadastrarCodigo() {
        this.codigo = (14265);
    }

    public void cadastrarEndereco() {
        this.endereco = "Rua Tupi";
    }
}
