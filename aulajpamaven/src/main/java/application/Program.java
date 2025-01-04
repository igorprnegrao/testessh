package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "joaquim", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "anna maria", "annamaria@gmail.com");
		
		// estanciar e fazer a ligação como o bando de dados 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		//código para iniciar transação como o bando de dados
		em.getTransaction().begin();
		//salvar as pessoas no banco de dados
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		//código para enviar os dados das pessoas para o banco de dados 
		em.getTransaction().commit();
		System.out.println("pronto!");
		
	}

}
