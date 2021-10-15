package org.faruck;

public  abstract class Carroceria {

    public String Carroceria;

    public abstract String mostrarcarroceria();

    public String getCarroceria()
    {
        return Carroceria;
    }

    public void setCarroceria(String motor)
    {
        this.Carroceria = motor;
    }
}
