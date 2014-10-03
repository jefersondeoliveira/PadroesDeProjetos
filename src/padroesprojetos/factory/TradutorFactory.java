/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.factory;

/**
 *
 * @author informatica
 */
public class TradutorFactory {
    
    public Tradutor getTradutor(String idioma){
        
        if(idioma.equalsIgnoreCase("jp")){
            return new TradutorJapones();
        }else{
            return new TradutorIngles();
        }
                
    }
    
}
