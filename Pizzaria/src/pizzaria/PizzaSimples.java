package pizzaria;

public class PizzaSimples implements Pizza {
    
    private String descricao;
    private boolean queijo;
    private boolean calabresa;
    private boolean bacon;
    private boolean borda;


    public String getDescricao() {
        return descricao;
    }
    
    public boolean isQueijo() {
        return queijo;
    }

    public boolean isCalabresa() {
        return calabresa;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isBorda() {
        return borda;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuejo(boolean queijo) {
        
        if(queijo){
            
            BuscadorFreezer freezer = new BuscadorFreezer();
            BuscadorEstoque estoque = new BuscadorEstoque();
            freezer.setProximo(estoque);

            BuscarIngrediente chainPremium = new BuscadorFreezer();
            chainPremium.setProximo(estoque);
            Boolean achou = chainPremium.buscarEmCadeia();

            if(achou){
                this.queijo = queijo;
            }else {
                this.queijo = false;
            }
        }else {
            this.queijo = queijo;
        }
        
    }

    public void setCalabresa(boolean calabresa) {
        
        if(calabresa){
            
            BuscadorFreezer freezer = new BuscadorFreezer();
            BuscadorEstoque estoque = new BuscadorEstoque();
            freezer.setProximo(estoque);

            BuscarIngrediente chainPremium = new BuscadorFreezer();
            chainPremium.setProximo(estoque);
            Boolean achou = chainPremium.buscarEmCadeia();

            if(achou){
                this.calabresa = calabresa;
            }else {
                this.calabresa = false;
            }
        }else {
            this.calabresa = calabresa;
        }
    }

    public void setBacon(boolean bacon) {
        
        if(bacon){
            
            BuscadorFreezer freezer = new BuscadorFreezer();
            BuscadorEstoque estoque = new BuscadorEstoque();
            freezer.setProximo(estoque);

            BuscarIngrediente chainPremium = new BuscadorFreezer();
            chainPremium.setProximo(estoque);
            Boolean achou = chainPremium.buscarEmCadeia();

            if(achou){
                this.bacon = bacon;
            }else {
                this.bacon = false;
            }
        }else {
            this.bacon = bacon;
        }
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }
}
