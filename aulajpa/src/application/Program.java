package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "joaquim", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(3, "anna maria", "annamaria@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
