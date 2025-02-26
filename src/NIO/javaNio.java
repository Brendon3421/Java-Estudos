package NIO;

import java.io.File;

public class javaNio {
	public static void main(String[] args) {
		File diretorio = new File("c:\\rocket\\curso-java");
		System.out.println("Diretorio Existe? " + diretorio.exists());
		if (!diretorio.exists()) {
			diretorio.mkdirs();
			System.out.println("Diretorio foi criado com sucesso" + diretorio.exists());
		}
		try {
			File arquivo = new File(diretorio, "java-teste.txt");
			arquivo.createNewFile();
			System.out.println("Arquivo criado? " + arquivo.exists());

		} catch (Exception e) {
			System.out.println("deu error" + e);
		}
	}
}
