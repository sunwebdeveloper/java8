package domain;

import java.util.List;
import java.util.Arrays;

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

public class Capitulo2 {

	public static void main(String [] args){
		Usuario user1 = new Usuario("Paulo Silveira",150);
		Usuario user2 = new Usuario("Rodrigo Turini",120);
		Usuario user3 = new Usuario("Guilherme Silveira",190);		
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for(Usuario u:usuarios){
			System.out.println(u.getNome());
		}
	}
}