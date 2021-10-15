package org.faruck;

public class OpelAstralFactory implements CocheFactory {

    @Override
    public Motor crearMotor()
    {
    return new AstralopelMotor();
    }
    @Override
    public Carroceria crearCarroceria()
    {
    return new AstralLopelCarroceria();
    }
    @Override
    public Rines crearRines()
    {
        return new AstralLopelRines();
    }


}
