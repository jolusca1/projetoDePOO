import Tarefa.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTarefas listaTarefas = new ListaTarefas();

        while (true) {
            System.out.println("\n=== Sistema Gerenciador de Tarefas ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Exibir Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    Tarefa novaTarefa = new Tarefa(descricao);
                    listaTarefas.adicionarTarefa(novaTarefa);

                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("=== LISTA DE TAREFAS ===");
                    listaTarefas.exibirTarefas();
                    break;

                case 3:
                    System.out.println("Digite o índice da tarefa a ser marcada como concluída: ");
                    int indice = scanner.nextInt();

                    listaTarefas.marcarTarefaComoConcluida(indice);

                    break;

                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}