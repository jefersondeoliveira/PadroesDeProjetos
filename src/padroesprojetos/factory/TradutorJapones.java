/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.factory;

/**
 *
 * @author informatica
 */
public class TradutorJapones implements Tradutor{

    @Override
    public void traduzir(String texto) {
        System.out.println("Traduzindo "+texto+" do japones");
    }
    
}
