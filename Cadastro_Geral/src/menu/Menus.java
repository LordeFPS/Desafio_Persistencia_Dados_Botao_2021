/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Lorde
 */
public class Menus {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    public static int menuGeral(){
        System.out.println("******************************");
        System.out.println("** 1 - Cadastrar            **");
        System.out.println("** 2 - Finalizar Cadastro   **");
        System.out.println("** 3 - Consultar            **");
        System.out.println("** 4 - Sair                 **");
        System.out.println("******************************");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public static int menuCadastrar(){
        System.out.println("****** Cadastar ******");
        System.out.println("** 1 - Pessoa       **");
        System.out.println("** 2 - Salas        **");
        System.out.println("** 3 - Espaço Café  **");
        System.out.println("** 4 - Voltar       **");
        System.out.println("**********************");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public static int menuConsulta(){
        System.out.println("****** Consulta ******");
        System.out.println("** 1 - Pessoa       **");
        System.out.println("** 2 - Salas        **");
        System.out.println("** 3 - Café         **");
        System.out.println("** 4 - Tudo        **");
        System.out.println("** 5 - Voltar       **");
        System.out.println("**********************");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }
    
}
