package pizzaria;

public class Pizzaria {

    public static void main(String[] args) {
        BuilderConcrect builderConcrect = new BuilderConcrect();
        Pizza p1 = new BuilderConcrect()
                        .temDescricao("Pizza de 4 queijos")
                        .temBacon(false)
                        .temBorda(true)
                        .temCalabresa(false)
                        .temQueijo(true)
                        .build();
        Pizza p2 = new BuilderConcrect()
                        .temDescricao("Pizza de Calabresa")
                        .temBacon(true)
                        .temBorda(false)
                        .temCalabresa(true)
                        .temQueijo(false)
                        .build();
        
        Pizza kit1 = new PizzaComposta(p1,p2);
        
        System.out.println(p1.isBacon() + " " + p1.isBorda() + " " + p1.isCalabresa() + " " + p1.isQueijo());
        System.out.println(kit1.getDescricao());
    }
    
}
