import play.jobs.*;
import models.*;

@OnApplicationStart
public class Bootstrap extends Job{
    public void doJob(){
        if(User.count() == 0) {
            User u1 = new User("Usuari1", "pwd").save();
            Datos d1 = new Datos("1453","ESA1234567").save();
            u1.datos.add(d1);
            d1.user= u1;
            u1.save();
            d1.save();
        }
    }
}
