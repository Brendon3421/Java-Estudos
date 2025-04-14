package Collection;

import java.util.*;

public class Conjuntos {
  public static void main(String[] args) {
    HashSet inscritos = new HashSet();
    inscritos.add("Marcos");
    inscritos.add("Lucas");
    inscritos.add("Antonio");
    inscritos.add("Mirela");
    inscritos.add("Alessandra");
    inscritos.add("Felipe");
    inscritos.add("Sofia");
    // opa Lucas já fez a sua inscrição
    inscritos.add("Lucas");

    imprimirInscritos(inscritos);

    /**
     * Alessandra
     * Felipe
     * Mirela
     * Sofia
     * Marcos
     * Lucas
     * Antonio
     */
  }
  // não se assuste com o nível de abstração, em breve você vai entender
  static void imprimirInscritos(Collection inscritos){
    System.out.println("***Listando os inscritos***");
    for(Object inscrito: inscritos){
      System.out.println(inscrito);
    }
  }
}