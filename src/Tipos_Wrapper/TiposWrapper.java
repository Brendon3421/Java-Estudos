package Tipos_Wrapper;

public class TiposWrapper {
	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.compareTo(obj2));
		
//		String num = "123.23";
//		double i = Double.parseDouble(num);
//				System.out.println(i); converte uma string para double
//		
//		double numeroDouble = 123.31;
//		int numeroINT = (int) numeroDouble; // -Conversao para 
//		System.out.println(numeroINT);
	}
}
