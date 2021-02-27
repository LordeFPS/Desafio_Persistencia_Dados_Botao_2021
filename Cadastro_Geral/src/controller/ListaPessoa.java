/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import entidade.Pessoa;
import java.util.LinkedList;



/**
 *
 * @author Lorde
 */
public class ListaPessoa {
    
    public static LinkedList<Pessoa> pessoas = new LinkedList();   


    public void inserirPessoa(String nome, String  sobrenome) {
        pessoas.add(new Pessoa(nome, sobrenome));   
    }
    
    
    
    public void inserirPessoaSala (int  posicao, String etapa1, String etapa2, String cafe){
        //String etapa1, String etapa2, String cafe
        //pessoas.push(new Pessoa(etapa1, etapa2, cafe));
        pessoas.add(posicao, new Pessoa(etapa1, etapa2, cafe));
        //pessoas.addAll(posicao, pessoas);
    }
    
    public void consultaNome(String nome){
        for (Pessoa obj : pessoas){
            if (nome.contains(obj.getNome())){
                System.out.println("\nNome Completo: " + obj + 
                                   "\nSala Etapa 1: " + obj.getEstapa1() +
                                   "\nSala Etapa 2: " + obj.getEstapa2() +
                                   "\nSala de Cafe: " + obj.getCafe() + "\n") ;
                return;
            }
            
        }
    }
    
    public int tamanhoPessoas(){
        return pessoas.size();
    }
    
    public void listarTodosPessoa(){
        for (Pessoa obj : pessoas){
            System.out.println(obj);
        }
    }
    
    public LinkedList<Pessoa> getListaPessoas(){
        return pessoas;
    }
}
