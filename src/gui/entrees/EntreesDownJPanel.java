package gui.entrees;

import javax.swing.*;

/**
 * Created by aurelien on 21/11/2015.
 */
public class EntreesDownJPanel extends JPanel {
    protected JButton ajouter = new JButton("Ajouter");
    protected JButton supprimer = new JButton("Supprimer");
    protected JButton nettoyer = new JButton("Nettoyer");

    public EntreesDownJPanel() {
        this.add(ajouter);
        this.add(supprimer);
        this.add(nettoyer);
    }

    public JButton getAjouter() {
        return ajouter;
    }

    public JButton getSupprimer() {
        return supprimer;
    }

    public JButton getNettoyer() {
        return nettoyer;
    }

}
