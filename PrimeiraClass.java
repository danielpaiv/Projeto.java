package ProjetoJava.Daniel;

public class PrimeiraClass {
    public static void main(String aegs[]) {
        System.out.print("Olá Daniel");

        Cliente cliente = new Cliente();
        cliente.cadastrarCodigo();
        cliente.cadastrarEndereco();
        cliente.cadastrarNome();
        cliente.cadastrarValor();
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getNome());
        System.out.println(cliente.getValor());

    }
}
