/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.strategy;

/**
 *
 * @author informatica
 */
public class Human {
    
    private EatStrategy eatStrategy;
    
    public Human(EatStrategy eatStrategy){
        this.eatStrategy = eatStrategy;
    }
    
    public void eat(){
        this.eatStrategy.eat();
    }

    public EatStrategy getEatStrategy() {
        return this.eatStrategy;
    }

    public void setEatStrategy(EatStrategy eatStrategy) {
        this.eatStrategy = eatStrategy;
    }
    
        
}
