/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.objeto;

/**
 *
 * @author SATC
 */
public class Notas {
    private String disciplina;
    private TipoAvaliacao tipo;
    private float nota;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public TipoAvaliacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoAvaliacao tipo) {
        this.tipo = tipo;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Notas(String disciplina, TipoAvaliacao tipo, float nota) {
        this.disciplina = disciplina;
        this.tipo = tipo;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\ndisciplina: " + disciplina + ", tipo: " + tipo + ", nota=" + nota + '_';
    }

   
        
    }

   
    

   
    
    

