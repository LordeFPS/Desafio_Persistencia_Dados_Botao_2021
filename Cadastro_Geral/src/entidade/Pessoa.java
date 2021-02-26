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

    public void listar(){
        System.out.println(nome + " " + sobrenome);
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + ", ";
    }

    
    
    
}
