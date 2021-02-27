/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import controller.ListaPessoa;
import controller.ListaSala;
import java.util.LinkedList;

/**
 *
 * @author Lorde
 */
public class Cafe{
    private String cafe;
    public ListaPessoa participante;

    public Cafe() {
    
    }

    public Cafe(String cafe) {
        this.cafe = cafe;
    }
    
    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }

    public void listar(){
        System.out.println(cafe);
    }
    
    @Override
    public String toString() {
        return cafe;
    }
}
