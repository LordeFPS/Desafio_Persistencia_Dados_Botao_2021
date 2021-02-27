/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import controller.ListaPessoa;


/**
 *
 * @author Lorde
 */
public class Sala{
    private String sala;
    private int lotacao;
    public ListaPessoa participante1;
    public ListaPessoa participante2;

    
    public Sala(String sala, int lotacao) {
        this.sala = sala;
        this.lotacao = lotacao;
    }
    
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
    
    public void listar(){
        System.out.println(sala);
        System.out.println("Lotação: " + lotacao);
    }

    @Override
    public String toString() {
        return sala + ", Lotação: " + lotacao + ", ";
    }

   
    
}
