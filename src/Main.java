import dao.ConnectionBdd;
import dao.DAO;
import dao.exception.DAOCannotInsertException;
import dao.exception.find.AnnuaireNotFoundInDBException;
import dao.implement.AnnuaireDAO;
import dao.implement.NumberDAO;
import domaine.Entry;
import domaine.Number;
import factory.Annuaire;
import gui.MainFrame;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TODO
 */
public class Main {
    public static void main(String[] args) throws IOException {
/*
        Entry entry = new Entry("Jean-Charles", "De la Motte de sel");
        Number num = new Number("Foo", "010101010", entry);

            DAO<Number> numberDAO = new NumberDAO();

            // Add
            num = numberDAO.create(num);

            // Get
            System.out.println(numberDAO.find(num.getId()));

            // Update
            num.setCode("Baracuda!");
            numberDAO.update(num);
            System.out.println(numberDAO.find(num.getId()));

            // Delete
            numberDAO.delete(num);*/

        try {
            Annuaire annuaireController = (new AnnuaireDAO()).find(null);
            new MainFrame(annuaireController).setVisible(true);
        } catch (AnnuaireNotFoundInDBException e) {
            System.out.println("ERROR DURING INITIALIZATION.");
            System.exit(666);
        }
    }
}
