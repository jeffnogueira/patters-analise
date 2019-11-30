/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

/**
 *
 * @author jeffe
 */
public class BuscadorEstoque extends BuscarIngrediente {

    @Override
    public Boolean busca() {
        System.out.println("Buscando no estoque...");
        return true;
    }
    
}
