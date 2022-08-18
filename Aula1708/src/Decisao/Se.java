/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decisao;

import javax.swing.JOptionPane;

public class Se {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Idade:"));
                
        if (idade <= 18) {
            System.out.println("Menor");
        }else{
            System.out.println("Maior");
            
        }
    }
}
