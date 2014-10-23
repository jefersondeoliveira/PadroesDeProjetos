/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.composite;

/**
 *
 * @author Jeferson
 */
public class ProdutoUnico implements Produto{
    
    private Double preco;
    
    public ProdutoUnico(Double preco){
        this.preco = preco;
    }

    @Override
    public Double getPreco() {
       return preco;
    }

       
}
