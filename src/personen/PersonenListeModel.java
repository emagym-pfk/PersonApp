/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personen;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author falcon
 */
public class PersonenListeModel extends AbstractListModel 
{

    private ArrayList<Person> personenListe;

    public ArrayList<Person> getPersonenListe()
    {
        return personenListe;
    }

    public void setPersonenListe(ArrayList<Person> personenListe)
    {
        this.personenListe = personenListe;
    }
    
    public Person getPersonAtIndex(int idx) {
        return personenListe.get(idx);
    }
    
    public void loeschePersonAnIndex(int idx) {
        
        // Person aus ArrayList löschen
        System.out.println("VOR dem Löschen: (Anzahl) " + personenListe.size());
        personenListe.remove(idx);
        System.out.println("NACH dem Löschen: (Anzahl) " + personenListe.size());
        
        // Hallo: ich habe neue Daten
        fireIntervalRemoved(this, idx, idx);
    }
    
    @Override
    public int getSize()
    {
        return this.personenListe.size();
    }

    @Override
    public String getElementAt(int index)
    {
        return this.personenListe.get(index).getName();
    }
    
}
