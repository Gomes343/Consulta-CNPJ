/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.control;

import mvc.view.BaixadoFrame;
import mvc.view.ConsultaFrame;

/**
 *
 * @author Gomes
 */
public class JanelasControl {
    
    public Boolean voltar(){
        
        ConsultaFrame volta = new ConsultaFrame();
        volta.setVisible(true);
        
        return true;
    }
    
    public Boolean baixado(){
        
        BaixadoFrame baixado = new BaixadoFrame();
        baixado.setVisible(true);
        
        return true;
    }
    
    
    
}
