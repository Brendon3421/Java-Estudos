
import java.util.Scanner;

public class ClassesEssencial {
    public static void main(String[] args) {
        String nome = null;
        Integer idade = null;
        Double peso = null;

        String dadosNaLinha = "brendon das novinhas;21;73.31";
        Scanner scan = new Scanner(dadosNaLinha);
        scan.useDelimiter(";");
        int index = 0;


        while (scan.hasNext()) {
            if (index == 0) {
                nome = scan.next();
            } else if (index == 1) {
                idade = Integer.valueOf(scan.next());
            } else  {
                peso = Double.valueOf(scan.next());
            }
            index++;
        }
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        scan.close();
        
    }
}
