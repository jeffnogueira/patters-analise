package pizzaria;

public class BuilderConcrect extends BuilderAbstract {
    public BuilderConcrect(){
        pizzaSimples  = new PizzaSimples();
    };
    
    public BuilderConcrect temDescricao(String descricao){
        pizzaSimples.setDescricao(descricao);
        return this;
    }
    
    public BuilderConcrect temQueijo(boolean queijo){
        pizzaSimples.setQuejo(queijo);
        return this;
    }
    
    public BuilderConcrect temCalabresa(boolean calabresa){
        pizzaSimples.setCalabresa(calabresa);
        return this;
    }
    
    public BuilderConcrect temBacon(boolean bacon){
        pizzaSimples.setBacon(bacon);
        return this;
    }
    
    public BuilderConcrect temBorda(boolean borda){
        pizzaSimples.setBorda(borda);
        return this;
    }
    
    public PizzaSimples build(){
        return pizzaSimples;
    }
}
