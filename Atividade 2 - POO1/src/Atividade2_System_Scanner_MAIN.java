import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atividade2_System_Scanner_MAIN {
	private static double converter(String texto) {
		return Double.parseDouble(texto);
	}
	 public static void main(String[] args) throws IOException {
		
		 FileInputStream arquivo = new FileInputStream("teste.txt");
		 InputStreamReader input = new InputStreamReader(arquivo);
		 try (BufferedReader br = new BufferedReader(input)) {
			String linha;
			 do {
				 double nota1 = 0;
			     double nota2 = 0;
			     double media = 0;
				 linha = br.readLine();
				 if(linha != null) {
					 String[] palavras = linha.split(";");
					 nota1 = converter(palavras[1]);
				     nota2 = converter(palavras[2]);
				     media = (nota1 + nota2) / 2;
				     System.out.println(palavras[0]+ ": " + " Nota 1 = " + nota1 + 
				    		 " Nota 2 = " + nota2 + "/ Média: " + media);
				 }
			 }while(linha != null);
		} catch (NumberFormatException  e) {
			System.out.println("A linha contém erros");
		}
	}
}