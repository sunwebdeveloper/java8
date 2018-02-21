package domain;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;


class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;
	
	public Usuario(String nome, int pontos){
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getPontos(){
		return this.pontos;
	}
	
	public void tornarModerador(){
		this.moderador = true;
	}
	
	public boolean isModerador(){
		return this.moderador;
	}		
}


class Consumidor implements Consumer<Usuario> {
	
	public void accept(Usuario e){
		System.out.println(e.getNome());
	}
	
}

public class Capitulo2 {

	public static void main(String [] args){
		Usuario user1 = new Usuario("Paulo Silveira",150);
		Usuario user2 = new Usuario("Rodrigo Turini",120);
		Usuario user3 = new Usuario("Guilherme Silveira",190);		
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		//Forma antiga de iterar sobre uma lista
		System.out.println("Impressao pre-java8");
		for(Usuario u:usuarios){
			System.out.println(u.getNome());
		}
		
		
		//Forma com forEach do Java8
		System.out.println(System.getProperty("line.separator"));
		System.out.println("Impressao pos-java8");
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		System.out.println(System.getProperty("line.separator"));
		new Thread(()->{
			try {
				Thread.sleep(3000);
				System.out.println("Lambda com Runnable!!");
			} catch(Exception e){
				e.printStackTrace();
			}
			
		}).start();
	}
}