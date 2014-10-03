/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.singleton;

/**
 *
 * @author informatica
 */
public class Singleton {
    
    private static Singleton instance;
    private Long date;
    
    public static Singleton getInstance(){
        
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    private Singleton(){
        date = System.currentTimeMillis();
    }
    
    public Long getData(){
        return date;
    }
}
