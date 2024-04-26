package JavaBasico.Sintaxe;

import JavaBasico.Sintaxe.Exceptions.NomeInvalido;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static String nome;
    private static double saldo;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);


        System.out.print("Digite o seu nome completo: ");
        validarInput("nome", in);

        System.out.print("Digite o saldo inicial: ");
        validarInput("saldo", in);

        ContaTerminal conta = new ContaTerminal(nome, saldo);
        System.out.println(conta);
    }

    static void validarInput(String info, Scanner scanner){
        switch (info){
            case "nome":
                while(true){
                    try {
                        String nome = scanner.nextLine();
                        ContaTerminal.validarInfo(nome);
                        Main.nome = nome;
                        break;
                    } catch (NomeInvalido e) {
                        System.out.print(e.getMessage() + "\nPor favor, digite novamente: ");
                    }
                }
                break;
            case "saldo":
                while(true){
                    try {
                        double saldo = scanner.nextDouble();
                        ContaTerminal.validarInfo(saldo);
                        Main.saldo = saldo;
                        break;
                    } catch (NomeInvalido e) {
                        System.out.print(e.getMessage() + "\nPor favor, digite novamente: ");
                    } catch (InputMismatchException e) {
                        System.out.print("O saldo deve ser um número.\nPor favor, digite novamente: ");
                        scanner.nextLine();
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Parâmetro inválido.");
        }
    }


}
