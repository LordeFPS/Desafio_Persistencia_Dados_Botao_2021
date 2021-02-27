/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Timer;

/**
 *
 * @author Lorde
 */
public class Sala extends Pessoa{
    private String sala;
    private int lotacao;

    public Sala() {
    }

    public Sala(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public Sala(String sala, int lotacao) {
        this.sala = sala;
        this.lotacao = lotacao;
    }
    
    public Sala(String nome, String sobrenome, String sala, int lotacao) {
        super(nome, sobrenome);
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
        super.listar();
        System.out.println(sala);
        System.out.println("Lotação: " + lotacao);
    }

    @Override
    public String toString() {
        return super.toString() + sala + ", Lotação: " + lotacao + ", ";
    }

   
    
}
