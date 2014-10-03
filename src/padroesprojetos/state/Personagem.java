/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.state;

/**
 *
 * @author Jeferson
 */
public class Personagem {
    
    private EstadoPersonagem estadoPersonagem;
    
    public Personagem(){
        estadoPersonagem = new Terra();
    }

    public EstadoPersonagem getEstadoPersonagem() {
        return estadoPersonagem;
    }

    public void setEstadoPersonagem(EstadoPersonagem estadoPersonagem) {
        this.estadoPersonagem = estadoPersonagem;
    }
    
    public void pressionouA(){
        estadoPersonagem.andar();
    }
    
    public void pressionouB(){
        estadoPersonagem.atirar();
    }
    
}
