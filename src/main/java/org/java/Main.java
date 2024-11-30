package org.java;

import org.java.creature.BadCreature;
import org.java.creature.GoodCreature;
import org.java.human.Human;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a elige tu propia aventura. Elige el personaje con quien viajarás:");
        System.out.println("solo tienes una vida, intenta sobrevivir pero no es oro todo lo que reluce");
        int life = 1;
        Human guerrero = new Human("Guerrerx", " un humano fornidx, violentx, agresivx y con muchas ganas de pelea", "violento");
        Human anciana = new Human("ancianx", " una persona mayor, madura, juiciosa y tolerante. Amante de la no violencia", "compasivo");
        System.out.println("Puedes escoger entre:");
        System.out.println("1. Un/a Guerrerx.");
        System.out.println("2. Un/a ancianx.");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.nextLine();
        if(answer == 1){
            System.out.println(guerrero.greeting());
        } else if(answer == 2){
            System.out.println(anciana.greeting());
        } else {
            System.out.println("por favor escoge bien el número");
        }
        System.out.println("Ahora escoge a dónde quieres ir");
        System.out.println("1. Bosque");
        System.out.println("2. Cruce de caminos");
        System.out.println("3. Zona acuática");
        System.out.println("4. Debajo del árbol de Navidad");
        System.out.println("escribe el número del lugar al que te desplazas:");
        int place = scanner.nextInt();
        scanner.nextLine();
        if(place == 1){
            GoodCreature Harpia = new GoodCreature("Harpía", "un ave grande con cabeza de mujer ", "bosque", true);
            System.out.println("1 " + Harpia.greeting());
            BadCreature Principe = new BadCreature("Príncipe", "un príncipe de cuento siempre me salgo con la mía", "bosque", false);
            System.out.println("2 " + Principe.greeting());
            System.out.println("A quién te acercas, escribe su número");
            int characterElection = scanner.nextInt();
            scanner.nextLine();
            if(characterElection == 1 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura, esta se va herida y asustada, no te había hecho nada, pierdes vida");
                life = life - Harpia.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 1 && answer == 2){
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la Harpía y esta te trata con respeto y te regala una vida");
                life = life + Harpia.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 2 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura y esta te ataca");
                life = life + Principe.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else {
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la criatura y esta te ataca, no te fíes de las apariencias");
                life = life + Principe.attack();
                System.out.println("Te quedan " + life + " vidas");
            }
        } else if (place == 2){
            GoodCreature vampiro = new GoodCreature("Vampiro", "un ser de la noche, inmortal y bebedor de sangre ", "cruce de caminos", true);
            System.out.println("1 " + vampiro.greeting());
            BadCreature arconte = new BadCreature("Arconte", "un ser celestial enviado para cuidar, vengar o juzgar", "cruce de caminos", false);
            System.out.println("2 " + arconte.greeting());
            System.out.println("A quién te acercas, escribe su número");
            int characterElection = scanner.nextInt();
            scanner.nextLine();
            if(characterElection == 1 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura, esta se va herida y asustada, no te había hecho nada, pierdes vida");
                life = life - vampiro.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 1 && answer == 2){
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la Harpía y esta te trata con respeto y te regala una vida");
                life = life + vampiro.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 2 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura y esta te ataca");
                life = life + arconte.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else {
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la criatura y esta te ataca, no te fíes de las apariencias");
                life = life + arconte.attack();
                System.out.println("Te quedan " + life + " vidas");
            }
        }else if(place == 3){
            GoodCreature sirena = new GoodCreature("Sirena", "soy una mujer con cola de pez que canta para atraerte ", "zona acuática", true);
            System.out.println("1 " + sirena.greeting());
            BadCreature ninfa = new BadCreature("Ninfa", "soy una dulce muchacha con alas delicadas", "zona acuática", false);
            System.out.println("2 " + ninfa.greeting());
            System.out.println("A quién te acercas, escribe su número");
            int characterElection = scanner.nextInt();
            scanner.nextLine();
            if(characterElection == 1 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura, esta se va herida y asustada, no te había hecho nada, pierdes vida");
                life = life - sirena.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 1 && answer == 2){
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la Harpía y esta te trata con respeto y te regala una vida");
                life = life + sirena.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 2 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura y esta te ataca");
                life = life + ninfa.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else {
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la criatura y esta te ataca, no te fíes de las apariencias");
                life = life + ninfa.attack();
                System.out.println("Te quedan " + life + " vidas");
            }
        } else if (place == 4){
            GoodCreature krampus = new GoodCreature("Krampus", "una critura con orejas de elfo y grandes cuernos y llevo un saco ", "debajo del árbol de navidad", true);
            System.out.println("1 " + krampus.greeting());
            BadCreature papaNoel = new BadCreature("Papá Noel", " un viejo gordo que trae regalos a los niñxs", "debajo del árbol de navidad", false);
            System.out.println("2 " + papaNoel.greeting());
            System.out.println("A quién te acercas, escribe su número");
            int characterElection = scanner.nextInt();
            scanner.nextLine();
            if(characterElection == 1 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura, esta se va herida y asustada, no te había hecho nada, pierdes vida");
                life = life - krampus.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 1 && answer == 2){
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la Harpía y esta te trata con respeto y te regala una vida");
                life = life + krampus.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else if(characterElection == 2 && answer == 1){
                System.out.println("Como eres " + guerrero.sayRol() + " agredes a la criatura y esta te ataca");
                life = life + papaNoel.attack();
                System.out.println("Te quedan " + life + " vidas");
            } else {
                System.out.println("Como eres " + anciana.sayRol() + " hablas amablemente con la criatura y esta te ataca, no te fíes de las apariencias");
                System.out.println("de verdad te fías de un viejo desconocido que le lleva regalos a los niñxs?");
                life = life + papaNoel.attack();
                System.out.println("Te quedan " + life + " vidas");
            }
        }
        if (life == 0) {
            System.out.println("Pierdes, sé más amable la próxima vez, no te fies de las apariencias");
        } else {
            System.out.println("Bien hecho, no te dejas llevar por las apariencias y actúas de manera amable");
        }
        scanner.close();
    }
}