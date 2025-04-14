package Collection;

import java.util.ArrayList;
import java.util.List;


public class Genericos {
	  public static void main(String[] args) {
	    List <CocaCola> engradadoCocaCola = new ArrayList();
	    engradadoCocaCola.add(new CocaCola());
	    //engradadoCocaCola.add(new FantaLaranja()); // impossível
	    engradadoCocaCola.add(new CocaCola());

	    for(CocaCola item: engradadoCocaCola){
	      System.out.println("Este item é uma coca-cola ou fanta laranja? " + item.getClass().getSimpleName());
	    }
	  }
	}
	class CocaCola{ }
	class FantaLaranja{}