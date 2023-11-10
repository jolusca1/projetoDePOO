package Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).concluir();
            System.out.println("Tarefa marcada como concluída: " + tarefas.get(indice).getDescricao());
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
