package org.faruck;

public class FordFocusFactory implements CocheFactory {
    public Motor crearMotor()
    {
        return new FordMotor();
    }
    public Carroceria crearCarroceria()
    {
        return new FordCarroceria();
    }
    public Rines crearRines()
    {
        return new FordRines();
    }
}
