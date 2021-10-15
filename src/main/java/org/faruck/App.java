package org.faruck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args ) throws IOException{
        BufferedReader Ingresar = new BufferedReader(new InputStreamReader(System.in));
        CocheFactory auto;
        Motor motor;
        Rines rines;
        Carroceria carroceria;
        String Tipo;

        System.out.println("Bienvenido, tenemos 2 variaedades de choches, Ford y Astral, Cual quisiera  Conocer?");
        Tipo = Ingresar.readLine().toLowerCase();


        if (Tipo.equals("ford"))
        {
            auto = new FordFocusFactory();

            motor = auto.crearMotor();
            System.out.println(motor.mostrarmotor());

            carroceria = auto.crearCarroceria();
            System.out.println(carroceria.MostrarCarroceria());

            rines = auto.crearRines();
            System.out.println(rines.mostrarRines());

        }
        else if(Tipo.equals("opel"))
        {
            auto = new OpelAstralFactory();
            motor = auto.crearMotor();
            System.out.println(motor.mostrarmotor());

            carroceria = auto.crearCarroceria();
            System.out.println(carroceria.MostrarCarroceria());

            rines = auto.crearRines();
            System.out.println(rines.mostrarRines());
        }
        else {
            System.out.println("No existe este Coche");
            System.exit(0);
        }

    }


}
