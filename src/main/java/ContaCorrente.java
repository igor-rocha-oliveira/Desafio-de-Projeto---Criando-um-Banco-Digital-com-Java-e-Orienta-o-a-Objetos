public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void impromirExtrato(){
        System.out.println("extrato da conta corrente");
        super.imprimirDadosConta();
    }
}
