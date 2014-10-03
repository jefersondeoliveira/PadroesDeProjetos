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
public class Terra implements EstadoPersonagem{

    @Override
    public void andar() {
        System.out.println("Anda normal");
    }

    @Override
    public void atirar() {
        System.out.println("Atira normal");
    }
    
}
