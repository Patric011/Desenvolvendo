/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Execercicio;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
        
    public class SomaJO {
        
       void soma(){
        
      try{
    
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        
        int res = A+B;
        
        JOptionPane.showMessageDialog(null, "O valor da soma é: "+ res);
        
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro 101");
            
                
    }
    
}
    }