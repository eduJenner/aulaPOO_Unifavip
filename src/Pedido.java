/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardojenner
 */
public class Pedido {
    private int numero=100;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int gerarNumeroDoPedido(){
        int numeroGerado = (int) (Math.random() * this.numero);
     return numeroGerado;
    }
  
}
