/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.template;

/**
 *
 * @author informatica
 */
public abstract class Relatorio {
    
    public void gerarRelatorio(){
        
        buscarDados();
        calcular();
        exportar();
        
    }
    
    private void buscarDados(){
        System.out.println("buscando dados..");
    }
    
    private void calcular(){
        System.out.println("calculando...");
    }
    
    public abstract void exportar();
    
}
