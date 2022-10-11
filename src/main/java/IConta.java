public interface IConta {

    void sacar(Double valor);

    void depositar(Double valor);

    void tranferir(Double valor, IConta contaDestino);

    void impromirExtrato();
}
