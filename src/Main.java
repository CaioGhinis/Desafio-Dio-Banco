import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Caio");
        cc.depositar(100);
        Conta cc2 = new ContaCorrente("Victor");
        cc.depositar(300);
        Conta cc3 = new ContaCorrente("Mateus");
        cc.depositar(200);
        Conta cc4 = new ContaCorrente("Ricardo");
        cc.sacar(100);

        Conta cp = new ContaPoupanca("Thales");
        cc.transferir(100, cp, Tipo.PIX );
        cc.transferir(50, cp, Tipo.TED);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        /*List<String> nomesClientes = cc.getNomesClientes();
        for(String nome : nomesClientes){
            System.out.println("Cliente: " + nome);
        }*/
    }
}
