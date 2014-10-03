/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.bridge;

/**
 *
 * @author Jeferson
 */
public abstract class BRelatorio {
    private Processador processador = new ProcessadorNormal();
    
    public void gerarRelatorio(){
        
        buscarDados();
        calcularDados();
        exportarDados();
        processador.processarDados();
        
    }

    private void buscarDados() {
        System.out.println("buscando dados");
    }

    private void calcularDados() {
        System.out.println("calculando dados");
    }
    
    public abstract void exportarDados();

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }
    
    
    
}
