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
public class BuscaNaMemoria extends BuscadorDeDados{

    public BuscaNaMemoria(BuscadorDeDados proximo) {
        super(proximo);
    }

    @Override
    public String buscarDadosEspecificos() {
        //return "busquei na memoria";
        return null;
    }
    
}
