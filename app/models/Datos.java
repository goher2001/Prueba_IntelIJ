package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Datos extends Model {

    public String dinero;
    public String iban;

    @ManyToOne
    public User user;

    public Datos( String dinero, String iban) {

        this.dinero = dinero;
        this.iban = iban;
    }
}
