/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luanl
 */
public class ToDoList {

    private static List<Tarefas> listaTarefas = new ArrayList<Tarefas>();
    /**
     * @param args the command line arguments
     */
    
    public static int menu(){
        System.out.println("\n--------------------------"
                         + "\n     Lista de tarefas     "
                         + "\n--------------------------"
                         + "\nEscolha a opcao desejada: "
                         + "\n1- Adicionar item"
                         + "\n2- Mostrar itens"
                         + "\n3- Alterar status"
                         + "\n4- Deletar item");
                         
        Scanner scanner = new Scanner(System.in);
        int iOpcao=scanner.nextInt();
        
        
        return iOpcao;
    }
    
    public static void addItem(){
        System.out.println("Adicionar item");
        System.out.println("----------------------");
        System.out.print("Insira um item: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        
        String choice = "";
        do{
            System.out.println("\nDeseja adicionar uma descricao? "
                         + "\n S- sim"
                         + "\n N- nao");
            choice = scanner.nextLine();
            if(choice.toLowerCase().equals("s")){
                System.out.println("Insira uma descricao:");
                String descricao = scanner.nextLine();
                listaTarefas.add(new Tarefas(nome, descricao));
                break;
            }
            else if(choice.toLowerCase().equals("n")){
                listaTarefas.add(new Tarefas(nome));
                break;
            }
        }while(choice != "s" || choice != "n");
        
        showList();
    }
    
    public static void showList() {
        System.out.println();
        System.out.println("----------------------");       
        System.out.println("To-Do List");
        System.out.println("----------------------");
        int number = 0;
        for (Tarefas item : listaTarefas) {
            System.out.println(++number + " " + item);
        }
        System.out.println("----------------------");


    }
    
    public static void removeItem() {
        System.out.println("Remover Item");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual item você quer remover:");
        showList();
        int index = scanner.nextInt();
        if((index-1) < 0 || index > listaTarefas.size()) {
            System.out.println("O id nao pode ser encontrado! Favor inserir um id de 1 a " + listaTarefas.size());            
        }else {
            listaTarefas.remove(index-1);
        }
        System.out.println("----------------------");
        showList();


    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
            case 1:
                addItem();
                break;
            case 2:
                showList();
                break;
            case 4:
                removeItem();
                break;
            case 0:
                break;
            default:
                System.out.println("Escolha uma opção valida:");
            }
        }
    }
    
}
