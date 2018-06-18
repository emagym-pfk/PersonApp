/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personen;

import java.util.Objects;

/**
 *
 * @author falcon
 */
public class Person
{
    // Eigenschaften (Variablen)
    private String name;
    private int alter;
    private double groesse;
    private double gewicht;
    
    // Konstruktoren
    public Person() {
        System.out.println("Hallo, Hier ist der Personen-Konstruktor!");
        this.name = "UNBEKANNT";
        this.alter = 16;
        this.groesse = 185.0;
        this.gewicht = 70.0;
    }

    public Person(String name, int alter, double groesse, double gewicht) {
        this.name = name;
        this.alter = alter;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }
    
    // Verhaltensweisen
    
    // Methode zur Berechnung des BMI
    // Funktion zum Berechnen des BMI
    public double berechneBMI() {
        double bmi = this.gewicht / (this.groesse * this.groesse);
        
        return bmi;
    }
    
    // Setter und Getter

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAlter()
    {
        return alter;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public double getGroesse()
    {
        return groesse;
    }

    public void setGroesse(double groesse)
    {
        this.groesse = groesse;
    }

    public double getGewicht()
    {
        return gewicht;
    }

    public void setGewicht(double gewicht)
    {
        this.gewicht = gewicht;
    }
    
    @Override
    public String toString() {
        String objString = super.toString();
        return objString + "\tName: " + this.name + " Gewicht: " + this. gewicht +
                " Alter: "+ this. alter + " Größe:  " + this.groesse;
    }

    
}