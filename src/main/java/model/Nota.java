/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LASEDi 1781
 */
public class Nota {
    private int id;
    private Aluno aluno;
    private String disciplina;
    private Turma turma;
    private int bimestre;
    private double nota;

    public Nota() {}

    public Nota(int id, Aluno aluno, String disciplina, Turma turma, int bimestre, double nota) {
        this.id = id;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.turma = turma;
        this.bimestre = bimestre;
        this.nota = nota;
    }


    public int getId() {
        return id; 
    }
    public void setId(int id) {
        this.id = id; 
    }

    public Aluno getAluno() {
        return aluno; 
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getDisciplina() {
        return disciplina; 
    }
    public void setDisciplina(String disciplina) { 
        this.disciplina = disciplina; 
    }

    public Turma getTurma() {
        return turma; 
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getBimestre() {
        return bimestre;
    }
    public void setBimestre(int bimestre) { 
        this.bimestre = bimestre; 
    }

    public double getNota() {
        return nota; 
    }
    public void setNota(double nota) {
        this.nota = nota; 
    }
}