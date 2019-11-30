package pizzaria;

public class PizzaComposta implements Pizza {
    
    private Pizza pizza1;
    private Pizza pizza2;

    public PizzaComposta(Pizza pizza1, Pizza pizza2) {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }
    
    @Override
    public String getDescricao() {
        return this.pizza1.getDescricao() + " e " + this.pizza2.getDescricao();
    }

    @Override
    public boolean isQueijo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCalabresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isBacon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isBorda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
