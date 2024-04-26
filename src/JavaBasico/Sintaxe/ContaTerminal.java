package JavaBasico.Sintaxe;

import JavaBasico.Sintaxe.Exceptions.NomeInvalido;

public class ContaTerminal {
    private static final String agencia = "067-8";
    private static int nextNumero = 1000;
    private final int numero;
    private final String nome;
    private final double saldo;

    public ContaTerminal(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.numero = nextNumero++;
    }

    @Override
    public String toString(){
        return "Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + ContaTerminal.agencia + " conta " + this.numero
                + " e seu saldo " + this.saldo  + " já está disponível para saque.";
    }

    public static void validarInfo(String nome) throws NomeInvalido {
        if (!nome.matches("^[a-zA-ZÀ-ÿ ]*$")){
            throw new NomeInvalido("O nome deve conter apenas letras.");
        }
    }

    public static void validarInfo(double saldo) throws NomeInvalido {
        if (saldo < 0){
            throw new NomeInvalido("O saldo não pode ser negativo.");
        }
    }
}
