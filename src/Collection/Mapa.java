package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Mapa {
  public static void main(String[] args) {
    Map estadosBrasileiro = new HashMap();
    estadosBrasileiro.put("SP","SAO PAULO");
    estadosBrasileiro.put("PI","PIAUI");
    estadosBrasileiro.put("MA","MARANHAO");
    estadosBrasileiro.put("AM","AMAZONAS");
    estadosBrasileiro.put("BA","BAHIA");
    estadosBrasileiro.put("GO","GOIAS");

    Iterator ufsIterator = estadosBrasileiro.keySet().iterator();
    while (ufsIterator.hasNext()) {
      Object key   =  ufsIterator.next();

      Object value =  estadosBrasileiro.get(key);

      System.out.println("Sigla: " + key + " Nome: " + value);
    }

    // outro exemplo
    // Map e Enum são contexto diferentes
    // Avalie cada contexto e usabilidade

    Map estadosCivil = new HashMap();
    estadosCivil.put("S","SOLTEIRO(A)");
    estadosCivil.put("C","CASADO(A)");
    estadosCivil.put("D","DIVORCIADO(A)");
    estadosCivil.put("V","VIUVO(A)");
  }
}
