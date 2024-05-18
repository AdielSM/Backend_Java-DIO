package Collections.List;

import java.util.ArrayList;

public class ListaTarefas {
    private final ArrayList<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao.toLowerCase()));
    }

    public void removerTarefa(String descricao){

        if(this.tarefas.isEmpty()){
            throw new IllegalArgumentException("Lista vazia");
        }

        for (Tarefa tarefa : this.tarefas) {
            if(tarefa.descricao().equals(descricao.toLowerCase())){
                this.tarefas.remove(tarefa);
                return;
            }
        }

        throw new IllegalArgumentException("Tarefa não encontrada para esta descrição.");
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefas.size();
    }

    public ArrayList<String> obterDescricoesTarefas(){

        if(this.tarefas.isEmpty()){
            throw new IllegalArgumentException("Lista de tarefas vazia");
        }

        ArrayList<String> descricoes = new ArrayList<>();

        for (Tarefa tarefa : this.tarefas) {
            descricoes.add(tarefa.descricao());
        }

        return descricoes;
    }
}

record Tarefa(String descricao){ }
