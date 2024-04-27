package JavaBasico.Banco;

public class BancoTerminal {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 18;

        sacar(saldo, valorSolicitado); // Saque realizado com sucesso!

        System.out.println("Saldo atual: " + saldo);

        saldo = 15;
        valorSolicitado = 22;

        sacar(saldo, valorSolicitado); // Saldo insuficiente!
    }

    static void sacar(double saldo, double valorSolicitado) {
        if (saldo >= valorSolicitado) {
            System.out.println("Saque realizado com sucesso!");
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

}
