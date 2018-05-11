/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.objeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Aluno {
    private String nome;
    private int matricula;
    private List<Notas> notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Notas> getNotas() {
        return notas;
    }

    public void setNotas(List<Notas> notas) {
        this.notas = notas;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        notas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Aluno: " + "\nnome=" + nome + ", matricula=" + matricula + ", notas=" + notas + '_';
    }
     public double calcularMedia(){
         float somaTotal = 0;
         for (Notas nota : notas) {
             somaTotal+= nota.getNota();
             
         }
         return somaTotal/notas.size();
     }
    
}
