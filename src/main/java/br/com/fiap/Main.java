package br.com.fiap;

import br.com.fiap.domain.entity.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");

        EntityManager manager = factory.createEntityManager();

        Aluno joedinho = new Aluno();
        joedinho.setNome("Joederson Oliveira Pereira").setRm("RM971925");

        Aluno iguinho = new Aluno();
        iguinho.setNome("Igor").setRm("RM97091");

        manager.getTransaction().begin();
        manager.persist( joedinho );
        manager.persist( iguinho );

        manager.getTransaction().commit();

        manager.close();
        factory.close();

        System.out.println(joedinho);
        System.out.println(iguinho);

    }
}