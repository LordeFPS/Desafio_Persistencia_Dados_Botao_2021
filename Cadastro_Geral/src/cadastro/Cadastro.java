/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;


import controller.ListaCafe;
import controller.ListaPessoa;
import controller.ListaSala;
import entidade.Pessoa;
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
        // Cadastra as pessoas previamente para fazer os testes.
        pessoas.inserirPessoa("joao", "aa");
        pessoas.inserirPessoa("jorge", "aa");
        pessoas.inserirPessoa("edian", "aa");
        pessoas.inserirPessoa("lorde", "aa");
        pessoas.inserirPessoa("gabriel", "aa");
        pessoas.inserirPessoa("lucas", "aa");
        pessoas.inserirPessoa("junin", "aa");
        
        // Cadastra as salas previamente para fazer os testes.
        salas.inserirSala("Sala1", 5);
        salas.inserirSala("Sala2", 5);
        salas.inserirSala("Sala3", 5);
        
        // Cadastra os espaços de cafe previamente para fazer os testes.
        cafes.inserirCafe("CafeA");
        cafes.inserirCafe("CafeB");
        
        boolean constante = true;
        boolean isOpen = true;
        //Inicio do código entrando nos menus
        while (constante) {            
            int opcao = menuGeral();
               
            if (opcao == 1){
                if (isOpen  == true){
                    boolean constanteCadastro = true;
                    // Acesse o menu de Cadastro
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
               // Faz a finalização dos cadastros e faz a distribuição das pessoas
               // nas salas e cafés
               }else if (opcao == 2){
                if (isOpen == false){   
                    System.out.println("Ja encerrou as incricoes anteriormente.");
                }else{
                    isOpen = false; 
                    System.out.println("Cadastros encerrados. Fichas de inscricao"
                                                    + "atualizadas ccom sucesso!");
                    //TODO código de distribuição de salas.
                    int totalpessoas  = pessoas.tamanhoPessoas();
                    int numeroSalas = salas.numeroSala();
                    int numeroCafes = cafes.numeroCafes();
                    int pessoasPorSala;
                    int restoDivisaoPessoas;
                    
                    pessoasPorSala = totalpessoas / numeroSalas;
                    restoDivisaoPessoas = totalpessoas % numeroSalas;
                    
                    int contadorPessoas = 0;
                    int metadeSala = totalpessoas / 2;
                    for (Pessoa pessoaAtual: pessoas.getListaPessoas()){
               
                        int salaAtual = contadorPessoas % numeroSalas; 
                        int cafeAtual = contadorPessoas % numeroCafes; 
                        salas.inserirSalaEtapa1(salaAtual,pessoaAtual);
                        String nomeSala = salas.posicaoSala(salaAtual).getSala();
                        pessoas.getListaPessoas().get(contadorPessoas).setEstapa1(nomeSala);
                        String nomeSala2 = salas.posicaoSala(salaAtual).getSala();
                        String nomeCafe = cafes.posicaoCafe(cafeAtual).getCafe();
                        
                        if (contadorPessoas >= metadeSala){
                            int salaDireita = (salaAtual + 1) % numeroSalas;
                            salas.inserirSalaEtapa2(salaDireita,pessoaAtual);
                            nomeSala2 = salas.posicaoSala(salaDireita).getSala();
                            pessoaAtual.setEstapa2(nomeSala2);
                            
                        } 
                        else{
                            salas.inserirSalaEtapa2(salaAtual,pessoaAtual);
                            pessoaAtual.setEstapa2(nomeSala2);
                        }
                        cafes.inserirPessoaCafe(cafeAtual, pessoaAtual);
                        pessoaAtual.setCafe(nomeCafe);
                        contadorPessoas++;
                    }
                }
            // Acessa o menu de Consulta
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
                        System.out.print("Procurar por café: ");
                        String cafe = leitor.next();
                        cafes.consultaCafe(cafe);
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
