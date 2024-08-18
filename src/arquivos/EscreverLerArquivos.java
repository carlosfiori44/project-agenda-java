package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import agenda.Contato;

public class EscreverLerArquivos {
	private String nomeArquivo;
	private List<Contato> lista;
	
	public EscreverLerArquivos(String nomeArquivo, List<Contato> lista) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.lista = lista;
	}
	
	public void escreverArquivo() {
		FileOutputStream fluxo;
		
		try {
			fluxo = new FileOutputStream(nomeArquivo);
			ObjectOutputStream objeto = new ObjectOutputStream(fluxo);
			objeto.writeObject(lista);
			objeto.close();
			System.out.println("Arquivo Gravado com Sucesso!");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo Inexistente");
		} catch (IOException e) {
			System.out.println("Arquivo Corrompido");
		}
		
	}
	
	public List<Contato> lerArquivo(){
		try {
			FileInputStream fluxo = new FileInputStream(nomeArquivo);
			ObjectInputStream objeto = new ObjectInputStream(fluxo);
			lista = (List<Contato>) objeto.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo Inexistente");
			System.out.println("Criando o Arquivo....");
			escreverArquivo();
		} catch (IOException e) {
			System.out.println("Arquivo Corrompido");
		} catch (ClassNotFoundException e) {
		}
		return lista;
	}
}
