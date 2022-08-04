package org.example;

import org.example.Models.Actor;
import org.example.Models.Character;
import org.example.Models.Network;
import org.example.Models.Show;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Your code

        Actor actor1 = new Actor();
        Actor actor2 = new Actor();
        Actor actor3 = new Actor();

        actor1.setFirst_name("aaa");
        actor1.setLast_name("bb");
        actor2.setFirst_name("ccc");
        actor2.setLast_name("dd");
        actor3.setFirst_name("eee");
        actor3.setLast_name("ff");


        Character character1 = new Character();
        Character character2 = new Character();
        Character character3 = new Character();


        character1.setName("c1");
        character1.setCatchphrase("ahh");
        character2.setName("c2");
        character2.setCatchphrase("bhh");
        character3.setName("c3");
        character3.setCatchphrase("chh");


        Show show1 = new Show();
        Show show2 = new Show();
        Show show3 = new Show();

        show1.setName("s1");
        show1.setDay("d1");
        show1.setGenre("g1");
        show1.setSeason("Sea1");

        show2.setName("s2");
        show2.setDay("d2");
        show2.setGenre("g2");
        show2.setSeason("Sea2");

        show3.setName("s3");
        show3.setDay("d3");
        show3.setGenre("g3");
        show3.setSeason("Sea3");

        Network network1 = new Network();

        network1.setCall_letters("Call1");
        network1.setChannel(10);

        // Building Relations

        character1.setActor(actor1);
        character2.setActor(actor2);
        character3.setActor(actor3);

        character1.setShow(show1);
        character2.setShow(show2);
        character3.setShow(show3);

        show1.setNetwork(network1);
        show2.setNetwork(network1);
        show3.setNetwork(network1);


        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(actor1);
        entityManager.persist(actor2);
        entityManager.persist(actor3);

        entityManager.persist(character1);
        entityManager.persist(character2);
        entityManager.persist(character3);

        entityManager.persist(show1);
        entityManager.persist(show2);
        entityManager.persist(show3);

        entityManager.persist(network1);
        transaction.commit();
        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}