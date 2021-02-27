/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;


import controller.ListaCafe;
import controller.ListaPessoa;
import controller.ListaSala;
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
    static ListaPessoa pessoas = new  ListaPessoa();
    static ListaCafe cafes = new ListaCafe();
    static ListaSala salas = new ListaSala();
    
   
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
        boolean isOpen = true;
        
        while (constante) {            
            int opcao = menuGeral();
               
            if (opcao == 1){
                if (isOpen  == true){
                    boolean constanteCadastro = true;

                    while (constanteCadastro) {   
                        int cadastrar = menuCadastrar();

                            if(cadastrar == 1) {
                                System.out.print("Digite seu nome: ");
                                String nome = leitor.next();
                                System.out.print("Digite seu sobrenome: ");
                                String sobrenome = leitor.next();
                                pessoas.inserirPessoa(nome, sobrenome);
                                
                            }else if(cadastrar == 2){
                                System.out.print("Nome da sala sem espaço: ");
                                String sala = leitor.next();
                                System.out.print("Lotação maxima: ");
                                int lotacao = leitor.nextInt();
                                salas.inserirSala(sala, lotacao);
                            }else if(cadastrar == 3){
                                System.out.print("Nome da sala do Café: ");
                                String cafe = leitor.next();
                                cafes.inserirCafe(cafe);
                            }else if(cadastrar == 4){
                                   System.out.println("Voltou para o menu principal.");
                                   break;
                            }else{
                                System.out.println("Opção inválida!!");
                                continue;
                           }
                        }

                    }else {
                        System.out.println("Cadastro encerrado.");
                    }
                
               }else if (opcao == 2){
                if (isOpen == false){   
                    System.out.println("Ja encerrou as incricoes anteriormente.");
                }else{
                    isOpen = false; 
                    System.out.println("Cadastros encerrados. Fichas de inscricao"
                                                    + "atualizadas ccom sucesso!");
                    //TODO código de distribuição de salas.
                    int totalpessoas  = pessoas.totalPessoas();
                    int numeroSalas = salas.numeroSala();
                    int divisaoDePessoas;
                    int restoDivisaoPessoas;
                    
                    divisaoDePessoas = totalpessoas / numeroSalas;
                    restoDivisaoPessoas = totalpessoas % numeroSalas;
                    
                    System.out.println(totalpessoas);
                    System.out.println(numeroSalas);
                    System.out.println("Divisao: " + divisaoDePessoas);
                    System.out.println("Resto: " + restoDivisaoPessoas);
                    
                    for (int i  = 0; i < restoDivisaoPessoas; i++){
                        
                    }
                }
            }else if (opcao == 3){
                boolean constanteConsulta = true;
               
                while (constanteConsulta) {  
                    int consultar = menuConsulta();
                    
                    if(consultar == 1) {
                        System.out.print("Procurar por nome: ");
                        String nome = leitor.next();
                        pessoas.consultaNome(nome);
                        
                    }else if(consultar == 2){
                        System.out.print("Procurar por sala: ");
                        String sala = leitor.next();
                        salas.consultaSala(sala);
                        
                    }else if(consultar == 3){
                        //System.out.println("ListaCafe " + cafes.cafes.get(0).getCafe());
                        System.out.print("Procurar por café: ");
                        String cafe = leitor.next();
                        cafes.consultaCafe(cafe);
                        //cafes.listarTodosCafe();
                    }else if(consultar == 4){
                        System.out.println("Desenvolver ainda.");
                    }else if(consultar == 5){
                        System.out.println("Voltou para o menu principal.");
                        break;
                    }else{
                        System.out.println("Opção inválida!!");
                        continue;
                    }
                }
            }  else if (opcao == 4){
                System.out.println("Saiu do sistema.");
                break;
            } else {
                System.out.println("Opção inválida.");
                continue;
            }
        }
    }
}
