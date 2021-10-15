package org.faruck;

public class FordCarroceria extends Carroceria {

    @Override
    public String MostrarCarroceria()
    {
        System.out.println("Descripcion de la carroceria Ford \n");
        String carroceria = "La carroceria de ford esta realizada de titanio con un solo cuerpo de soldadura, el cual es capaz de soportar a hasta 2 toneladas de " +
                "nivel de metro en torque";
        return carroceria;
    }

}
