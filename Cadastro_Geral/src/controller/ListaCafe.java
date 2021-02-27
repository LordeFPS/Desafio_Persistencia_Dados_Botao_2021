/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidade.Cafe;
import entidade.Pessoa;
import java.util.LinkedList;

/**
 *
 * @author Lorde
 */
public class ListaCafe {
    static LinkedList<Cafe> cafes = new LinkedList();
    
    public void inserirCafe(String cafe){
        cafes.add(new Cafe(cafe));
    }
    public void consultaCafe(String cafe){
        for (Cafe obj : cafes){
            
            if (cafe.contains(obj.getCafe())){
               System.out.println("Cafe: "+obj.getCafe());
               listarParticipantes(obj);
            }
        }
    }
    public void inserirPessoaCafe(int indice,Pessoa pessoa){
        cafes.get(indice).addParticipante(pessoa);
    }
    
    public void listarParticipantes(Cafe cafe){
        int contador = 1;
        System.out.println("Total de Participantes no cafe: "+cafe.participantes.size());
        for (Pessoa participante: cafe.participantes){
            String nomeCompleto = participante.getNome() + " " + participante.getSobrenome();
            System.out.print(contador + " - "+ nomeCompleto + "\n");
            contador++;
        }
    }
    
    public int numeroCafes(){
        return cafes.size();
    }
    
    public Cafe posicaoCafe(int  posicao){
        return cafes.get(posicao);
    }
    
    public void listarTodosCafe(){
        for (Cafe obj : cafes){
            System.out.println(obj);
            
        }
    }
}
