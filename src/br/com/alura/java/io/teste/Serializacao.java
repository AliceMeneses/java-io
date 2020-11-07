package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serialização
		String nome = "alice";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();
		
		//Desserialização		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		nome = (String) ois.readObject();
		
		System.out.println(nome);
	}

}
