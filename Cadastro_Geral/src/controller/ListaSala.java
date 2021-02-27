/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entidade.Pessoa;
import entidade.Sala;
import java.util.LinkedList;

/**
 *
 * @author Lorde
 */
public class ListaSala {
    public static LinkedList<Sala> salas = new LinkedList();
    
    public void listarEtapa1(Sala sala){
        int contador = 1;
        System.out.println("Total de Participantes Etapa1 na Sala: "+sala.participantes1.size());
        for (Pessoa participante: sala.participantes1){
            String nomeCompleto = participante.getNome() + " " + participante.getSobrenome();
            System.out.print(contador + " - "+ nomeCompleto + "\n");
            contador++;
        }
    }
    
    public void listarEtapa2(Sala sala){
        int contador = 1;
        System.out.println("Total de Participantes Etapa2 na Sala: "+sala.participantes2.size());
        for (Pessoa participante: sala.participantes2){
            String nomeCompleto = participante.getNome() + " " + participante.getSobrenome();
            System.out.print(contador + " - "+ nomeCompleto + "\n");
            contador++;
        }
    }
    
    
    
    public void  inserirSala(String sala, int lotacao){
        salas.add(new Sala(sala, lotacao));
    }
    
    public void inserirSalaEtapa1(int indiceSala,Pessoa pessoinha){
        Sala salaSelecionada = salas.get(indiceSala);
        salaSelecionada.adicionarPessoaE1(pessoinha);
    }
    
    public void inserirSalaEtapa2(int indiceSala,Pessoa pessoinha){
        Sala salaSelecionada = salas.get(indiceSala);
        salaSelecionada.adicionarPessoaE2(pessoinha);
    }
    
    
    
    public void consultaSala(String sala){
        for (Sala obj : salas){
            if (sala.contains(obj.getSala())){
                System.out.println("\nNome da Sala: " + obj.getSala() + 
                                    "\nLotacao: " +obj.getLotacao() +" pessoas");
                listarEtapa1(obj);
                listarEtapa2(obj);
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
    
    public Sala posicaoSala(int  posicao){
        return salas.get(posicao);
    }
    
    
}
