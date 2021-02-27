/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.LinkedList;

/**
 *
 * @author Lorde
 */
public class Sala{
    private String sala;
    private int lotacao;
    public LinkedList<Pessoa> participantes1 = new LinkedList();
    public LinkedList<Pessoa> participantes2 = new LinkedList();

    public Sala() {
    }
   
    
    public void adicionarPessoaE1(Pessoa pessoa){
        this.participantes1.addLast(pessoa);
    }
    
    public void adicionarPessoaE2(Pessoa pessoa){
        this.participantes2.add(pessoa);
    }
    
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
        return sala + ", Lotação: " + lotacao;
    }

   
    
}
