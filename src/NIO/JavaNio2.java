package NIO;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * java.nio.file.Path Interface que representa um diretório de nosso
 * sistemaoperacional java.nio.file.Paths Classe que contém o recurso de criar
 * um objeto que represente o diretório informado java.nio.file.Files Classe que
 * contém os recursos de leitura e escrita de arquivos de forma estática
 * 
 */

public class JavaNio2 {
	public static void main(String[] args) {

		try {
			Path path = Paths.get("c:\\rocket\\curso-java\\java-teste.txt");

			// Lendo o path e convertendo todos os caracteres (bytes) de uma só vez
			byte[] bytesArquivo = Files.readAllBytes(path);

//			List<String> linhas= Files.readAllLines(path);
//			linhas.forEach(l ->System.out.println(l));
//			String conteudobb = "brendinho expanta xota";
//			Files.write(path, conteudobb.getBytes(StandardCharsets.UTF_8));
			
//			String conteudo = Files.readString(path);
//			System.out.println(conteudo);

			// Como são bytes podemos criar uma String a partir de agora
//			String conteudo = new String(bytesArquivo);
//			System.out.println(conteudo);

			// Agora veja como também é simples escrever arquivos textos.
			Path pathTo = Paths.get("c:\\\\rocket\\\\curso-java\\\\aula-java-nio-copy.txt");
			Files.write(pathTo, bytesArquivo);
			
			List<String> nomes = new ArrayList<>();
			nomes.add("juninho do grau");
			nomes.add("juninho da mt-06");
			
			StringBuilder conteudosJuninho = new StringBuilder();
			nomes.forEach(n-> conteudosJuninho.append(n+ "\n"));
			
			Files.write(path,conteudosJuninho.toString().getBytes(StandardCharsets.UTF_8));
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
