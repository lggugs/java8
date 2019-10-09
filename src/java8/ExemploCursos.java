/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author x44h
 */
class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

}

public class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));        
        
        cursos.sort(Comparator.comparing(Curso::getAlunos ));
        //cursos.forEach(c -> System.out.println(c.getNome()));
        
        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
                //.forEach( System.out::println);
                //.forEach(c -> System.out.println(c.getNome()));
                System.out.println(sum);
    }
}
