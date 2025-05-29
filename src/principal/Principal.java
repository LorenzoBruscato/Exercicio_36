package principal;

import model.Aluno;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Aluno> listaSimples = new ArrayList<>();

        Aluno aluno1 = new Aluno(1111, "João", 95, "Sistemas", 7);
        Aluno aluno2 = new Aluno(2222, "Maria", 21, "Computação", 2);

        listaSimples.add(aluno1);
        listaSimples.add(aluno2);

        System.out.println("\n--- TESTE 1 ---\n");
        System.out.println(listaSimples);

        listaSimples.remove(0);

        System.out.println("\n--- TESTE 2 ---\n");
        System.out.println(listaSimples);

        Aluno alunoAlterado = new Aluno(2222, "Maria da Silva", 25, "Computação Plus", 3);
        listaSimples.set(0, alunoAlterado);

        System.out.println("\n--- TESTE 3 ---\n");
        System.out.println(listaSimples);

        Aluno aluno3 = new Aluno(3333, "Rita", 46, "Sistemas", 4);
        Aluno aluno4 = new Aluno(4444, "Cláudio", 64, "Computação", 8);

        listaSimples.add(aluno3);
        listaSimples.add(aluno4);

        System.out.println("\n--- TESTE 4 - Listando Nomes ---\n");
        for (Aluno a : listaSimples) {
            System.out.println("Nome: " + a.getNome());
        }

        Collections.sort(listaSimples, Comparator.comparing(Aluno::getNome));

        System.out.println("\n--- TESTE 5 - Ordenado por Nome ---\n");
        for (Aluno a : listaSimples) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
