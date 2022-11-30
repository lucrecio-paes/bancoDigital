package banco.oceleolimite.edu;

public class ContaPoupanca extends Conta {


    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }

}
