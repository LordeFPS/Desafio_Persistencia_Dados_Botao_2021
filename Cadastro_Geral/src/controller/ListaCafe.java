/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidade.Cafe;
import java.util.ArrayList;

/**
 *
 * @author Lorde
 */
public class ListaCafe extends Cafe{
    ArrayList<Cafe> cafes = new ArrayList();
    
    public void inserirDados(String cafe, String nome, String sobrenome, String sala, int  lotacao) {
        cafes.add(new Cafe(cafe, nome, sobrenome, sala, lotacao));
    }
    
    public void listarDados() {
        for (int i = 0; i < cafes.size(); i++){
            System.out.println(  cafes.get(i));             
            System.out.println(" ");
        }
    }
}