/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LASEDi 1781
 */
import java.util.List;

public class Professor {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<String> disciplinas;
    private double cargaHorariaAtribuidaPorTurma;
    private double cargaHorariaComplementar;
    private String observacoes;

    public Professor() {}

    public Professor(int id, String nome, String cpf, String email, String telefone, List<String> disciplinas, double cargaHorariaAtribuidaPorTurma, double cargaHorariaComplementar, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.disciplinas = disciplinas;
        this.cargaHorariaAtribuidaPorTurma = cargaHorariaAtribuidaPorTurma;
        this.cargaHorariaComplementar = cargaHorariaComplementar;
        this.observacoes = observacoes;
    }


    public int getId() { 
        return id;
    }
    public void setId(int id) {
        this.id = id; 
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        this.nome = nome; 
    }

    public String getCpf() { 
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf; 
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getTelefone() { 
        return telefone; 
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone; 
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<String> disciplinas) { 
        this.disciplinas = disciplinas;
    }

    public double getCargaHorariaAtribuidaPorTurma() { 
        return cargaHorariaAtribuidaPorTurma; 
    }
    public void setCargaHorariaAtribuidaPorTurma(double cargaHorariaAtribuidaPorTurma) { 
        this.cargaHorariaAtribuidaPorTurma = cargaHorariaAtribuidaPorTurma;
    }

    public double getCargaHorariaComplementar() {
        return cargaHorariaComplementar;
    }
    public void setCargaHorariaComplementar(double cargaHorariaComplementar) { 
        this.cargaHorariaComplementar = cargaHorariaComplementar;
    }

    public String getObservacoes() { 
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}