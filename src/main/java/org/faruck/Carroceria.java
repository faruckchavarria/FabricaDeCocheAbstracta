package org.faruck;

public  abstract class Carroceria {

    public String Carroceria;

    public abstract String mostrarCarroceria();

    public String getCarroceria()
    {
        return Carroceria;
    }

    public void setCarroceria(String Carroceria)
    {
        this.Carroceria = Carroceria;
    }
}
