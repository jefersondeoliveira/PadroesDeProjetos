/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author informatica
 */
public class Observable {
 
    private List<Observer> listaObserver = new ArrayList<>();
    private int temperatura;
    
    public void addObserver(Observer observer){
        listaObserver.add(observer);
    }
    
    public int getTemperatura(){
        return temperatura;
    }
    
    public void setTemperatura(int valor){
        this.temperatura = valor;
        if(temperatura > 1){
            notificarTodos();
        }
    }
    
    private void notificarTodos(){
        
        for(Observer observer : listaObserver){
            observer.receberNotificacoes(temperatura);
        }
        
    }
    
}
