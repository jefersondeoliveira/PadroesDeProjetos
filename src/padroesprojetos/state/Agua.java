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
public class Agua implements EstadoPersonagem{

    @Override
    public void andar() {
        System.out.println("nao anda.. nada");
    }

    @Override
    public void atirar() {
        System.out.println("nao atira na agua");
    }
    
}
