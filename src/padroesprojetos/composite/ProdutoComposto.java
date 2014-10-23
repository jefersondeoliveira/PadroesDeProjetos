/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesprojetos.composite;

import java.util.List;

/**
 *
 * @author Jeferson
 */
public class ProdutoComposto implements Produto{
    
    private List<Produto> produtos;
    
    public ProdutoComposto(List<Produto> produtos){
        this.produtos = produtos;
    }


    @Override
    public Double getPreco() {
        Double total = 0.0;
        for(Produto produto : produtos){
            total += produto.getPreco();
        }
        return total;
    }
    
    
}
