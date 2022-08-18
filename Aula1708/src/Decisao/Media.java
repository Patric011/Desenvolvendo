/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decisao;

import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        
        double media = Integer.parseInt(JOptionPane.showInputDialog("Insira nota:"));
        
        if((media > 0)&&(media<5)) {
            System.out.println("Retido");
        } else if((media >= 5) &&(media <= 7)) {
             System.out.println("Regular");
             
        }else if ((media >7)&&(media <= 10)) {
            System.out.println("MB");
            
        }else{
            System.out.println("Erro");
        }
        
    } 
}
