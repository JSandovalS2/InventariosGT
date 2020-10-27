/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otros;

import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

/**
 *
 * @author Juanc
 */
public class AdminIFrame {
    
    public static void mostrarVentanaFactura(JDesktopPane dp,JInternalFrame vnt)
    {        
        if(vnt != null && !vnt.isShowing())
       {
           vnt.show();
           dp.remove(vnt);
            try{
                dp.add(vnt, JLayeredPane.DEFAULT_LAYER); 
            }catch(IllegalArgumentException ex){               
                dp.add(vnt, JLayeredPane.DEFAULT_LAYER); 
            }    
       }
        
        if(vnt == null)
        {          
          dp.add(vnt, JLayeredPane.DEFAULT_LAYER);
        } 
       activarVentana(dp,vnt);     
    }
    
    private static void activarVentana(JDesktopPane dp,JInternalFrame vnt)
    {
        try {
            vnt.setSelected(true);            
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        dp.setPosition(vnt, 0);
    }
    
    
}
