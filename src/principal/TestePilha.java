package principal;

import model.Aluno;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class TestePilha {
    public static void main(String[] args) {
        Stack<Aluno> pilha = new Stack<>();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "------ MENU PILHA ------\n" +
                "1 - Adicionar aluno (Push)\n" +
                "2 - Remover do topo (Pop)\n" +
                "3 - Mostrar topo (Peek)\n" +
                "4 - Listar pilha\n" +
                "5 - Procurar aluno (Search)\n" +
                "6 - Verificar se pilha está vazia\n" +
                "0 - Sair\n" +
                "-------------------------\n" +
                "Escolha uma opção:"
            ));

            switch (opcao) {
                case 1:
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno:"));
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
                    String curso = JOptionPane.showInputDialog("Digite o curso do aluno:");
                    int fase = Integer.parseInt(JOptionPane.showInputDialog("Digite a fase do aluno:"));

                    Aluno novoAluno = new Aluno(id, nome, idade, curso, fase);
                    pilha.push(novoAluno);
                    JOptionPane.showMessageDialog(null, "Aluno adicionado na pilha.");
                    break;

                case 2:
                    if (!pilha.isEmpty()) {
                        Aluno removido = pilha.pop();
                        JOptionPane.showMessageDialog(null, "Removido do topo: " + removido.getNome());
                    } else {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia.");
                    }
                    break;

                case 3:
                    if (!pilha.isEmpty()) {
                        Aluno topo = pilha.peek();
                        JOptionPane.showMessageDialog(null, "Topo da pilha: " + topo.getNome());
                    } else {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia.");
                    }
                    break;

                case 4:
                    if (!pilha.isEmpty()) {
                        StringBuilder lista = new StringBuilder();
                        for (Aluno a : pilha) {
                            lista.append(a.getId()).append(" - ")
                                 .append(a.getNome()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, "Conteúdo da pilha:\n" + lista.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia.");
                    }
                    break;

                case 5:
                    if (!pilha.isEmpty()) {
                        String nomeBusca = JOptionPane.showInputDialog("Digite o nome do aluno para procurar:");
                        int posicao = -1;
                        for (Aluno a : pilha) {
                            if (a.getNome().equalsIgnoreCase(nomeBusca)) {
                                posicao = pilha.search(a);
                                break;
                            }
                        }
                        if (posicao != -1) {
                            JOptionPane.showMessageDialog(null, "O aluno está na posição: " + posicao + " (1 é o topo)");
                        } else {
                            JOptionPane.showMessageDialog(null, "Aluno não encontrado na pilha.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia.");
                    }
                    break;

                case 6:
                    if (pilha.empty()) {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia.");
                    } else {
                        JOptionPane.showMessageDialog(null, "A pilha NÃO está vazia.");
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }
}
