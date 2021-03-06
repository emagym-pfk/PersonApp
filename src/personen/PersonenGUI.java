/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personen;

import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author falcon
 */
public class PersonenGUI extends javax.swing.JFrame implements ListSelectionListener
{
    
    /**
     * Creates new form PersonenGUI
     */
    public PersonenGUI()
    {
        initComponents();

        // ArrayList für die Sammlung aller Personen erstellen
        ArrayList<Person> pList = new ArrayList();
        // Zwei Test-Personen erzeugen ....
        Person p1 = new Person("Moritz", 34, 4234, 135);
        Person p2 = new Person("Max", 42, 75, 56);
        // ... und in der Liste ablegen
        pList.add(p1);
        pList.add(p2);
        
        // JList ein Model setzen
        PersonenListeModel model = new PersonenListeModel();
        // Die ArrayList mit Personen an das Model übergeben
        model.setPersonenListe(pList);
        
        // Der View (JList) das Model bekannt machen
        personenJList.setModel(model);
        
        // Wir registrieren uns für Änderungen an der Selektion der JList
        personenJList.addListSelectionListener(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personenJList = new javax.swing.JList<>();
        personNeuButton = new javax.swing.JButton();
        personLoeschenButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        personNameTextField = new javax.swing.JTextField();
        personGroesseLabel = new javax.swing.JLabel();
        personGroesseTextField = new javax.swing.JTextField();
        personAlterTextField = new javax.swing.JTextField();
        personGewchtTextField = new javax.swing.JTextField();
        speicherePersonenDatenButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Personen-DB"));

        personenJList.setModel(personenJList.getModel());
        jScrollPane1.setViewportView(personenJList);

        personNeuButton.setText("Neu");
        personNeuButton.addMouseWheelListener(new java.awt.event.MouseWheelListener()
        {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt)
            {
                personNeuButtonMouseWheelMoved(evt);
            }
        });
        personNeuButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                personNeuButtonActionPerformed(evt);
            }
        });

        personLoeschenButton.setText("Löschen");
        personLoeschenButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                personLoeschenButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jLabel1.setText("Name");

        jLabel2.setText("Alter");

        jLabel3.setText("Gewicht");

        personGroesseLabel.setText("Größe");

        speicherePersonenDatenButton.setText("Speichern");
        speicherePersonenDatenButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                speicherePersonenDatenButtonActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personAlterTextField)
                            .addComponent(personNameTextField)))
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(personGroesseLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personGewchtTextField)
                            .addComponent(personGroesseTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 224, Short.MAX_VALUE)
                        .addComponent(speicherePersonenDatenButton)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(personNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personAlterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personGewchtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personGroesseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personGroesseLabel))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(speicherePersonenDatenButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(personNeuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personLoeschenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personNeuButton)
                    .addComponent(personLoeschenButton))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personNeuButtonMouseWheelMoved(java.awt.event.MouseWheelEvent evt)//GEN-FIRST:event_personNeuButtonMouseWheelMoved
    {//GEN-HEADEREND:event_personNeuButtonMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_personNeuButtonMouseWheelMoved

    private void speicherePersonenDatenButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_speicherePersonenDatenButtonActionPerformed
    {//GEN-HEADEREND:event_speicherePersonenDatenButtonActionPerformed
        // Werte aus den Textfeldern besorgen und umwandenln (Datentyp)
        String personName = this.personNameTextField.getText();
        // ... setzen am ausgewählten Persone-Objekt
    }//GEN-LAST:event_speicherePersonenDatenButtonActionPerformed

    private void personNeuButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_personNeuButtonActionPerformed
    {//GEN-HEADEREND:event_personNeuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personNeuButtonActionPerformed

    private void personLoeschenButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_personLoeschenButtonActionPerformed
    {//GEN-HEADEREND:event_personLoeschenButtonActionPerformed
        // Prüfen, ob überhaupt eine Person ausgewählt ist, wenn ja, welche?
        int selIdx = personenJList.getSelectedIndex();
        System.out.println("Selected Person Index : " + selIdx);
        if( selIdx < 0 ) {
            // Nichts ist selktiert
            return;
        }
        
        // Person ist selektiert -- LÖSCHEN!
        // Die JList kennt ihr Model ...
        PersonenListeModel pModel = (PersonenListeModel)personenJList.getModel();
        pModel.loeschePersonAnIndex(selIdx);
        
    }//GEN-LAST:event_personLoeschenButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PersonenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PersonenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PersonenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PersonenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PersonenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField personAlterTextField;
    private javax.swing.JTextField personGewchtTextField;
    private javax.swing.JLabel personGroesseLabel;
    private javax.swing.JTextField personGroesseTextField;
    private javax.swing.JButton personLoeschenButton;
    private javax.swing.JTextField personNameTextField;
    private javax.swing.JButton personNeuButton;
    private javax.swing.JList<String> personenJList;
    private javax.swing.JButton speicherePersonenDatenButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e)
    {    
        // 1.
        int selIdx = personenJList.getSelectedIndex();
        System.out.println("Selected Person Index : " + selIdx);
        if( selIdx < 0 ) {
            // Nichts ist selktiert
            return;
        }
        
       // 2.
       // Die JList kennt ihr Model ...
       PersonenListeModel pModel = (PersonenListeModel)personenJList.getModel();
       Person selectedPerson = pModel.getPersonAtIndex(selIdx);
       
       // 3.
       personNameTextField.setText(selectedPerson.getName());
       personGewchtTextField.setText("" + selectedPerson.getGewicht());
       personGroesseTextField.setText("" + selectedPerson.getGroesse());
        
    }

}
