package ProjetoJava.Daniel;

public class Cliente {

    // essas são as variaveis con detalhes da venda en texxto nenusculo
    private int codigo;
    private String nome;
    private String endereco;
    private String valor;

    // Aqui fica oe métodos que recolhe os textosd as variaveis são dois metodos pra
    // cada get set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
    public void cadastrarCodigo() {
        this.codigo = (12354);
    }

    public void cadastrarNome() {
        this.nome = "Daniel";
    }

    public void cadastrarEndereco() {
        this.endereco = "Rua teste";

    }

    public void cadastrarValor() {
        this.valor = "2500";
    }
}