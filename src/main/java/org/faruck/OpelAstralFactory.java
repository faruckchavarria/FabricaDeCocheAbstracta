package org.faruck;

public class OpelAstralFactory implements CocheFactory {

    public Motor crearMotor()
    {
    return new AstralopelMotor();
    }
    public Carroceria crearCarroceria()
    {
    return new AstralLopelCarroceria();
    }
    public Rines crearRines()
    {
        return new AstralLopelRines();
    }


}
