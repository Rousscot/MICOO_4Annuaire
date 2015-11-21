package factory;

import dao.exception.insert.EntryInsertException;
import dao.exception.insert.NumberInsertException;
import dao.implement.EntryDAO;
import domaine.Entry;
import domaine.Number;
import domaine.exceptions.DuplicateEntryException;
import domaine.exceptions.DuplicateNumberException;

import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 * <p>
 * Donc les choses à faire si j'ai bien compris:
 * - Supprimer un contact
 * - Updater un contact (optionnel apparemment)
 * - Supprimer un numero à un contact
 */
public class Annuaire {

    protected List<Entry> entries;

    public Annuaire() {
        this.entries = new LinkedList();
    }

    public Annuaire createEntry(String firstName, String lastName) throws EntryInsertException, DuplicateEntryException {
        this.addEntry((new EntryDAO()).create(new Entry(firstName, lastName)));
        return this;
    }

    public Annuaire addEntry(Entry entry) throws DuplicateEntryException {
        if(this.entries.contains(entry)){
            throw new DuplicateEntryException(entry);
        }
        this.entries.add(entry);
        return this;
    }

    public Annuaire createNumberFor(Entry entry, String code, String value) throws NumberInsertException, DuplicateNumberException {
        //TODO check that the entry is in the Annuaire.
        entry.createNumber(code, value);
        return this;
    }

    public Annuaire deleteNumberOf(Entry entry, Number number){
        //TODO
        return this;
    }

    // GETTER SETTER

    public List<Entry> entries() {
        return entries;
    }

    public void entries(List<Entry> entries) {
        this.entries = entries;
    }
}
