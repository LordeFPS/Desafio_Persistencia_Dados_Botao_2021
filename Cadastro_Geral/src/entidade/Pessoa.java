/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Objects;

/**
 *
 * @author Lord
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String etapa1 = "\nSala Etapa 1: Inscrição em andamento. \n";
    private String etapa2 = "Sala Etapa 2: Inscrição em andamento. \n";
    private String cafe = "Sala de Cafe: Inscrição em andamento. \n";

    public Pessoa() {
    }
    
    public Pessoa(String etapa1, String etapa2, String cafe) {
        this.etapa1 = etapa1;
        this.etapa2 = etapa2;
        this.cafe = cafe;
    }
    
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEstapa1() {
        return etapa1;
    }

    public void setEstapa1(String etapa1) {
        this.etapa1 = etapa1;
    }

    public String getEstapa2() {
        return etapa2;
    }

    public void setEstapa2(String etapa2) {
        this.etapa2 = etapa2;
    }

    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }
    

    @Override
    public String toString() {
        return nome + " " + sobrenome + ", ";
    }
   
}
