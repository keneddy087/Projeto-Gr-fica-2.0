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
public enum TipoAvaliacao {
    PROVA("Avaliação"),
    TRABALHO("Trabalho"),
    SEMINARIO("Seminário");
   
  private String nomeAvaliacao;
 
 public String getNome(){
     return nomeAvaliacao;
 }  
 
 private TipoAvaliacao(String nome){
     nomeAvaliacao = nome;
 }
    
}
