package oo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    //Lista constante (final) o enderço de memória não pode mudar
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }
    void acidionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

}
