public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void impromirExtrato(){
        System.out.println("extrato da conta poupanca");
        super.imprimirDadosConta();
    }
}
