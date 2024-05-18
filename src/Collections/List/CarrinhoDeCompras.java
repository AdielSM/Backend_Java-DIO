package Collections.List;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private final ArrayList<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        if(this.itens.isEmpty()){
            throw new IllegalArgumentException("Lista vazia.");
        }

        for (Item item : this.itens) {
            if(item.nome().equals(nome)){
                this.itens.remove(item);
                return;
            }
        }

        throw new IllegalArgumentException("Item " + nome + " não encontrado");
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item item : this.itens) {
            total += item.preco() * item.quantidade();
        }

        return total;
    }

    public void exibirItens(){
        for (Item item : this.itens) {
            System.out.println(item.nome() + "\nValor: " +
                                item.preco() + "\nQuantidade: " +
                                item.quantidade());
        }
    }

}

record Item(String nome, double preco, int quantidade){ }