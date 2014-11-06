/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.chain;

/**
 *
 * @author Jeferson
 */
public abstract class BuscadorDeDados {
    
    private BuscadorDeDados proximo;
    
    public BuscadorDeDados (BuscadorDeDados proximo){
        this.proximo = proximo;
    }
    
    public abstract String buscarDadosEspecificos();
    
    public String localizarDadosAquiOuNoProximo(){
        
        String dado = buscarDadosEspecificos();
        
        if(dado == null){
            
            System.out.println("Não achei dado, fui para o proximo");
            
            if(proximo == null){
                return "Ops, dado não encontrado";
            }
            
            dado = proximo.localizarDadosAquiOuNoProximo();
            
        }
        return dado;
    }
            
}
