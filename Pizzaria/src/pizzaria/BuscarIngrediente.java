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
public abstract class BuscarIngrediente {
    private BuscarIngrediente proximo;
    public void setProximo(BuscarIngrediente proximo) {
        this.proximo = proximo;
    }
    
    public abstract Boolean busca();
    
    public Boolean buscarEmCadeia(){
        if (busca() == true){
            return true; 
        }else if (proximo!= null){
            return proximo.buscarEmCadeia();
        }else{
            return false;
        }
    }
}
