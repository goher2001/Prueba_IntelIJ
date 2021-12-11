package models;
import java.util.*;
import javax.persistence.*;

import play.db.jpa.Model;

@Entity
public class User extends Model {

    public String password;
    public String fullname;

    @OneToMany
    public List<Datos> datos = new ArrayList();

    public User( String fullname, String password) {

        this.password = password;
        this.fullname = fullname;
    }

}
