/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personen;

/**
 *
 * @author falcon
 */
public class Personen
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Person 1 erzeugen ...
        Person p1 = new Person();
        
        // Alle Eigenscaften erfragen
        System.out.println("Person 1: name=" + p1.getName());
        System.out.println("Person 1: alter=" + p1.getAlter());
        System.out.println("Person 1: groesse=" + p1.getGroesse());
        System.out.println("Person 1: gewicht=" + p1.getGewicht());
        // Setzen neuer Werte
        p1.setName("Max Mustermann");
        p1.setAlter(18);
        p1.setGewicht(65);
        p1.setGroesse(180);
        
        // Erneut Eigenschaften abfragen
        System.out.println("\nPerson 1: name=" + p1.getName());
        System.out.println("Person 1: alter=" + p1.getAlter());
        System.out.println("Person 1: groesse=" + p1.getGroesse());
        System.out.println("Person 1: gewicht=" + p1.getGewicht());

        Person p2 = new Person("Moritz", 42, 75, 135);
        System.out.println("\nPerson 2: name=" + p2.getName());
        System.out.println("Person 2: alter=" + p2.getAlter());
        System.out.println("Person 2: groesse=" + p2.getGroesse());
        System.out.println("Person 2: gewicht=" + p2.getGewicht());
        
        System.out.println("Personen P1 und P2 sind gleich ? " + (p1 == p2));
        
        Person p3 = p2;
        System.out.println("Personen P2 und P3 sind gleich ? " + (p2 == p3));
        
        System.out.println("\nP1 als String: " + p1.toString());
        System.out.println("P2 als String: " + p2.toString());
        System.out.println("P3 als String: " + p3);
        
        
        
        System.out.println("Personen P2 und P3 sind " + 
                "gleich (mittel equals-Methode) ? " + p2.equals(p3));

    }
   
    
}
