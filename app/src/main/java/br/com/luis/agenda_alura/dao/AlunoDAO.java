package br.com.luis.agenda_alura.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.luis.agenda_alura.model.Aluno;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();
    private static int contadorDeId = 1;

    public void salva(Aluno aluno) {
        aluno.setId(contadorDeId);
        alunos.add(aluno);
        contadorDeId++;
    }

    public void edita (Aluno aluno){
        Aluno alunoEncontrado = null;
        for(Aluno a : alunos){
            if(a.getId() == aluno.getId()){
                alunoEncontrado = a;
            }
        }
        if (alunoEncontrado != null){
            int posicaoDoAluno = alunos.indexOf(alunoEncontrado);
            alunos.set(posicaoDoAluno,aluno);
        }
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
