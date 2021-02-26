/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import controller.ListaCafe;
import entidade.Cafe;
import entidade.Pessoa;
import entidade.Sala;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static menu.Menus.menuCadastrar;
import static menu.Menus.menuConsulta;
import static menu.Menus.menuGeral;


/**
 *
 * @author Lorde
 */
public class Cadastro {
   static Scanner leitor = new Scanner(System.in);
   static ListaCafe cafes = new ListaCafe();
   
    public static void main(String[] args) {
        //teste();
        projeto();
    }
    // Teste de  como armazenar os  dados  e exibilos
    public static void teste() {
        /*
        cafes.inserirDados("Café B", "Joao", "Thomas", "Sala B", 4);
        cafes.inserirDados("Café A", "Gabriel", "Botao", "Sala A", 5);
        cafes.listarDados();
        */  
    }
    // Projeto onde executa o Sistema de cadastro e consulta
    public static void projeto() {
        boolean constante = true;
        
        while (constante) {            
            
        }
        
        
    }

}
