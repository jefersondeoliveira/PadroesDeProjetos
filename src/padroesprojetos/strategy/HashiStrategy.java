/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.strategy;

/**
 *
 * @author informatica
 */
public class HashiStrategy implements EatStrategy{

    @Override
    public void eat() {
        System.out.println("Comendo com Hashi");
    }
    
}
