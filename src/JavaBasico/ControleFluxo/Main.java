package JavaBasico.ControleFluxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número> ");
        validarInput(in);
        num1 = in.nextInt();

        System.out.print("Digite o segundo número> ");
        validarInput(in);
        num2 = in.nextInt();

        try{
            contador(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validarInput(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.print("Digite apenas números> ");
            scanner.nextLine();
        }
    }

    static void contador(int numero1, int numero2) throws ParametrosInvalidosException {
        if(numero2 < numero1){
            throw new ParametrosInvalidosException("O segundo número não pode ser menor que o primeiro.");
        }

        int quantidadeLoop = numero2 - numero1;
        for (int i = 1; i <= quantidadeLoop; i++) {
            System.out.printf("Imprimindo Número %d\n", i);
        }
    }

}
