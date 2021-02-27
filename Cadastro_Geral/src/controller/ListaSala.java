/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidade.Sala;
import java.util.LinkedList;

/**
 *
 * @author Lorde
 */
public class ListaSala {
    static LinkedList<Sala> salas = new LinkedList();
    
    public void  inserirSala(String sala, int lotacao){
        salas.add(new Sala(sala, lotacao));
    }
    public void consultaSala(String sala){
        for (Sala obj : salas){
            if (sala.contains(obj.getSala())){
                System.out.println(obj);
                System.out.print("Participante 1: ");
                obj.participante1.listarTodosPessoa();
                System.out.print("Participante 2: ");
                obj.participante2.listarTodosPessoa();
                return;
            }
        }
    }
    
    public int numeroSala(){
        return salas.size();
    }
    
    public void listarTodosSala(){
        for (Sala obj : salas){
            System.out.println(obj);
        }
    }
}
