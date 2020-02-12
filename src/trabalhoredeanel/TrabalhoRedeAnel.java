/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoredeanel;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class TrabalhoRedeAnel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        try{
             
           
             
        ListaDuplamenteLigadaCircular<String> p= new ListaDuplamenteLigadaCircular<String>();
        
        p.insere("A");
        p.insere("A");
        p.insere("A");
        System.out.println(p);
        
    
         
        }catch(Exception e){};
    
    }
}
