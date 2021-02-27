/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Lorde
 */
public class Cafe extends Sala{
    private String cafe;
   

    public Cafe() {
    }

    public Cafe(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public Cafe(String sala, int lotacao) {
        super(sala, lotacao);
    }
    
    public Cafe(String cafe) {
        this.cafe = cafe;
    }
    
    public Cafe(String cafe, String nome, String sobrenome, String sala, int lotacao) {
        super(nome, sobrenome, sala, lotacao);
        this.cafe = cafe;
    }

    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }

    public void listar(){
        super.listar();
        System.out.println(cafe);
    }

    @Override
    public String toString() {
        return super.toString() + cafe;
    }

    
    
    
}
