package dao;

import model.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class AlunoDAO {
    private static ArrayList<Aluno> minhaLista = new ArrayList<>();

    public static ArrayList<Aluno> getMinhaLista() {
        return minhaLista;
    }

    public static void setMinhaLista(ArrayList<Aluno> minhaLista) {
        AlunoDAO.minhaLista = minhaLista;
    }
}
