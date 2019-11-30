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
        this.queijo = queijo;
    }

    public void setCalabresa(boolean calabresa) {
        this.calabresa = calabresa;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }
}
