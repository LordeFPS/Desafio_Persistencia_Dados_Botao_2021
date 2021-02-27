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
            int opcao = menuGeral();
            
            if (opcao == 1){
                boolean constanteCadastro = true;
               
                while (constanteCadastro) {   
                    int cadastrar = menuCadastrar();
                    String nome;
                    String sobrenome;
                    String sala;
                    int lotacao;
                    String cafe;
                    
                    switch (cadastrar) {
                        case 1:
                            System.out.print("Digite seu nome: ");
                            nome = leitor.next();
                            System.out.print("Digite seu sobrenome: ");
                            sobrenome = leitor.next();
                            System.out.print("Nome da sala sem espaço: ");
                            sala = leitor.next();
                            System.out.print("Lotação maxima: ");
                            lotacao = leitor.nextInt();
                            System.out.print("Nome da sala do Café: ");
                            cafe = leitor.next();
                            cafes.inserirDados(cafe, nome, sobrenome, sala, lotacao);
                            break;
                        case 2:
                            
                            
                            break;
                        case 3:
                            
                            
                            break;
                        case 4:
                            System.out.println("Saiu do sistema.");
                            break;
                        default:
                            System.out.println("Opção inválida!!");
                            continue;
                        
                    }
                    break;
                }
                
            } else if (opcao == 2){
                int consultar = menuConsulta();
                boolean constanteConsulta = true;
               
                while (constanteConsulta) {                    
                    switch (consultar) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            cafes.listarDados();
                            break;
                        case 4:
                            System.out.println("Saiu do sistema.");
                            break;
                        default:
                            System.out.println("Opção inválida!!");
                            continue;
                    }
                    break;
                }
            } else if (opcao == 3){
                System.out.println("Saiu do sistema.");
                break;
            } else {
                System.out.println("Opção inválida.");
                continue;
            }
        }
    }
}
