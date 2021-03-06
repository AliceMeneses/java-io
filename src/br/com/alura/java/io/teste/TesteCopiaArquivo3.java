package br.com.alura.java.io.teste;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopiaArquivo3 {

	public static void main(String[] args) throws IOException{
		InputStream fis = System.in;//entrada pelo teclado
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("lorem5.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String conteudo = br.readLine();
		while(!conteudo.isEmpty()) {
			bw.write(conteudo);
			bw.newLine();
			conteudo = br.readLine();
		}
		
		bw.close();
		br.close();
		
	}

}

