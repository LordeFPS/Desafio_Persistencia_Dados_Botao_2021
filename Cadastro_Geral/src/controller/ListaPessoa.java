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
    static LinkedList<Pessoa> pessoas = new LinkedList();   
             
    public void inserirPessoa(String nome, String  sobrenome) {
        pessoas.add(new Pessoa(nome, sobrenome));   
    }
    
    public void consultaNome(String nome){
        for (Pessoa obj : pessoas){
            if (nome.contains(obj.getNome())){
                System.out.println(obj);
                System.out.println(obj.getEstapa1());
                System.out.println(obj.getEstapa2());
                System.out.println(obj.getCafe());
                return;
            }
            
        }
    }
    
    public int totalPessoas(){
        return pessoas.size();
    }
    
    public void listarTodosPessoa(){
        for (Pessoa obj : pessoas){
            System.out.println(obj);
        }
    }
}
