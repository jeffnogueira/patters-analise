package pizzaria;

public class BuilderConcrect extends BuilderAbstract {
    public BuilderConcrect(){
        pizza  = new Pizza();
    };
    
    public BuilderConcrect temQueijo(boolean queijo){
        pizza.setQuejo(queijo);
        return this;
    }
    
    public BuilderConcrect temCalabresa(boolean calabresa){
        pizza.setCalabresa(calabresa);
        return this;
    }
    
    public BuilderConcrect temBacon(boolean bacon){
        pizza.setBacon(bacon);
        return this;
    }
    
    public BuilderConcrect temBorda(boolean borda){
        pizza.setBorda(borda);
        return this;
    }
    
    public Pizza build(){
        return pizza;
    }
}
