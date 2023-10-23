import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    private static List<String> nomesClientes = new ArrayList<>();

    public Conta(String nomeCliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = new Cliente(nomeCliente);
        nomesClientes.add(nomeCliente);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<String> getNomesClientes(){
        return nomesClientes;
    }


    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino, Tipo tipo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência via " + tipo.getDescricao() + " realizada com sucesso!");
    }

    protected void imprimirInfosComuns() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
