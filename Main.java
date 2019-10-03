/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Korisnik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Object[] options= { "Ok", "Cancel" };
       
 JPanel panel = new JPanel();
  panel.add(new JLabel("Welcome"));
   int result = JOptionPane.showOptionDialog(null, panel, "Start working",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, null);
   
      panel.setSize(200,300);

    
    if (result == JOptionPane.NO_OPTION) {
     System.exit(0);
    } else if (result == JOptionPane.YES_OPTION) {
     Manipulation mn = new Manipulation();
      mn.setVisible(true);
   }
    }
    
}
