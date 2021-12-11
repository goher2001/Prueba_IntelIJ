package controllers;

import models.Datos;
import models.User;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void VerDatos (String fullname, String password){

        User us = User.find("byFullnameAndPassword", fullname, password).first();

        if(us != null){
            Datos d1 = Datos.find("byUser",us).first();

            renderText("Tus datos son:" + d1.dinero + "," + d1.iban );
        }
        else
            renderText("No hay datos");

    }
}