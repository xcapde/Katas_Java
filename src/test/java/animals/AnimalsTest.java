package animals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

    // Polimorfisme per herència: Arma de doble fil ja que si un animal camina ja no hi podem posar peix o serp...
    // Classe Cat amb dos constructors diferents i en crida un o altre segons si es posa atribut o no.
    @Test
    void catCanTalk(){
        var cat1 = new Cat();
        var cat2 = new Cat("Nom del Gat");
        // System.out.println(cat1.getName());
        // System.out.println(cat2.getName());

        // Creem classe pare "Animal" que embarca les altres --> Classe abstractes, les has de cridar a través dels seus fills.
        var cat = new Cat();
        // cat.talk();
        var dog = new Dog();
        // dog.talk();
        var cat3 = new Cat();

        // Podem fer llista perquè executi el mètode "talk" per a cada animal ja que mantenen el mateix tipus.
        // Podem fer servir-hi tots el mètodes que té "Animal"
        List<Animal> animalList = List.of(cat,dog,cat3);

        // ForEach amb LAMBDAS (funció fletxa ->)
        animalList.forEach(i -> i.talk());

    }

}