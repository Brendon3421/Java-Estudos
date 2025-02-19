package Controle_de_fluxo;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

		 public static void main(String[] args) {

			 try {
				 Number valor = NumberFormat.getInstance().parse("1.75");
				 double vd = valor.doubleValue();
				 System.out.println(vd);
			 } catch (ParseException ex) {
				 System.err.println("Numero invalido corno");
			 };
		 }
}


