/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.observer;

/**
 *
 * @author informatica
 */
public class TermometroAnalogico implements Observer{

    @Override
    public void receberNotificacoes(int temperatura) {
        System.out.println("Temperatura do term analogico alterada: "+temperatura);
    }
    
}
