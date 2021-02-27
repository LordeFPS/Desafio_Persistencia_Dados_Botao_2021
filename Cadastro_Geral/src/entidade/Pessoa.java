/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Objects;

/**
 *
 * @author Lorde
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String estapa1 = "Inscrição em andanmento.";
    private String estapa2 = "Inscrição em andanmento.";
    private String cafe = "Inscrição em andanmento.";

    public Pessoa() {
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
        return estapa1;
    }

    public void setEstapa1(String estapa1) {
        this.estapa1 = estapa1;
    }

    public String getEstapa2() {
        return estapa2;
    }

    public void setEstapa2(String estapa2) {
        this.estapa2 = estapa2;
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
