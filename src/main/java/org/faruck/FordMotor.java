package org.faruck;

public class FordMotor extends Motor{

    @Override
    public String mostrarmotor()
    {
        System.out.println("Descripcion del motor Ford \n");
        String motor = "Motor de 8 cilindros y 16 valculas, con aleacion de aluminio reforzado en pistones, con 600 caballos de fuerza";
        return motor;
    }
}
