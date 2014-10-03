/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.strategy;

/**
 *
 * @author informatica
 */
public class ForkAndKnifeeStrategy implements EatStrategy{

    @Override
    public void eat() {
        System.out.println("Comendo com Garfo e faca");
    }
    
}
