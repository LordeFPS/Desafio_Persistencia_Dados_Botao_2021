/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidade.Cafe;
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
                System.out.println(obj);
                obj.participante.listarTodosPessoa();
                return;
            }
        }
    }
    
    public void listarTodosCafe(){
        for (Cafe obj : cafes){
            System.out.println(obj);
            
        }
    }
}
