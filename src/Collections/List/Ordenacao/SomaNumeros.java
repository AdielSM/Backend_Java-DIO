package Collections.List.Ordenacao;

import java.util.ArrayList;

public class SomaNumeros {
    private ArrayList<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : this.numeros) {
            soma += numero;
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for (Integer numero : this.numeros) {
            if(numero > maior){
                maior = numero;
            }
        }

        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for (Integer numero : this.numeros) {
            if(numero < menor){
                menor = numero;
            }
        }

        return menor;
    }

    public void exibirNumeros(){
        for (Integer numero : this.numeros) {
            System.out.println(numero);
        }
    }
}
