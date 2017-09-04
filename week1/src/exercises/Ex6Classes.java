package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using classes for compound data of different types that in some sense belongs together
 *  (may be same type).
 *  Here we describe a "hero" using a class.
 *
 * See:
 * - ClassBasics
 */
public class Ex6Classes {

    public static void main(String[] args) {
        new Ex6Classes().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        out.println("What is the name of the Hero 1?");;
        Hero heroOne = new Hero();
        heroOne.name = sc.next();
        out.println("How strong is " + heroOne.name);
        heroOne.strength = sc.nextInt();

        out.println("What is the name of the Hero 2?");;
        Hero heroTwo = new Hero();
        heroTwo.name = sc.next();
        out.println("How strong is " + heroTwo.name);
        heroTwo.strength = sc.nextInt();

        if(heroOne.strength < heroTwo.strength) {
            out.println(heroTwo.name + " is stronger");
        }
        else if(heroOne.strength > heroTwo.strength) {
            out.println(heroOne.name + " is stronger");
        }
        else {
            out.println("Both heroes are equally strong");
        }
    }

    // ------ The class to use  -----------
    // A class for variables that describes a Hero
    class Hero {
        String name;
        int strength;
    }


}
