public class Main {
    public static void main(String[] args) {
        Cliente igor = new Cliente();
        igor.setNome("igor");

        Conta conta = new ContaCorrente(igor);
        Conta conta2 = new ContaPoupanca(igor);

        conta.depositar(100.0);
        conta.tranferir(50.0, conta2);

        conta.impromirExtrato();
        conta2.impromirExtrato();
    }
}
