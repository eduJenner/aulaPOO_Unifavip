
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardojenner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
      
      
      
      ArrayList<Lanche> lanches = new ArrayList();
       
       Lanche lanche1 = new Lanche(1,"cheeseburguer",4.00);
       Lanche lanche2 = new Lanche(2,"cachorro quente",3.00);
       Lanche lanche3 = new Lanche(3,"batata frita",3.00);
       Lanche lanche4 = new Lanche(4,"refrigerante lata",3.00);
       Lanche lanche5 = new Lanche(5,"suco",2.00);
       
       lanches.add(lanche1);
       lanches.add(lanche2);
       lanches.add(lanche3);
       lanches.add(lanche4);
       lanches.add(lanche5);
       
        int opcao = 0;
        double total = 0;
        
            System.out.println("escolha o seu lanche \n");
            System.out.println("1 cheeseburguer R$ 4.00");
            System.out.println("2 cachorro quente R$ 3.00");
            System.out.println("3 batata frita R$ 3.00");
            System.out.println("4 refrigerante lata R$ 3.00");
            System.out.println("5 copo de suco R$ 2.00");
            System.out.println("6 finalizar o pedido \n");
            opcao = t.nextInt();
        
    while(opcao!=6){     
       switch(opcao){
           case 1:
               System.out.println("voce adicionou "+ lanches.get(0));
               total += lanche1.getPreco();
               break;
           case 2:
               System.out.println("voce adicionou "+ lanches.get(1));
               total += lanche2.getPreco();
               break;
           case 3:
               System.out.println("voce adicionou "+ lanches.get(2));
               total += lanche3.getPreco();
                break;
           case 4:
               System.out.println("voce adicionou "+ lanches.get(3));
               total += lanche4.getPreco();
                break;
            case 5:
               System.out.println("voce adicionou "+ lanches.get(4));
               total += lanche5.getPreco();
                break;    
      }
        System.out.println("deseja adicionar mais algum item? para encerrar o pedido digite 6:\n");
        System.out.println("1 cheeseburguer R$ 4.00");
        System.out.println("2 cachorro quente R$ 3.00");
        System.out.println("3 batata frita R$ 3.00");
        System.out.println("4 refrigerante lata R$ 3.00");
        System.out.println("5 copo de suco R$ 2.00");
        System.out.println("6 finalizar o pedido");
           
        opcao = t.nextInt();
        System.out.println("\n total a pagar: R$: "+ total);         
    }
    //gera o código do pedido
        Pedido p1 = new Pedido();
        System.out.println("O código do pedido é: ");
        System.out.println(p1.gerarNumeroDoPedido());
       }
           
     
      
       
}
    

