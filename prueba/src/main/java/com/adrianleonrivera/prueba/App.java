package com.adrianleonrivera.prueba;

import com.adrianleonrivera.ejercicio.Coche;
import com.adrianleonrivera.ejercicio.Persona;


public class App 
{
    public static void main( String[] args )
    {
        Persona p1=new Persona("Juan");
        Persona p2=new Persona("Maria");
        
        Coche c1=new Coche();
        
        c1.getListaPersonas().add(p1);
        c1.getListaPersonas().add(p2);
        
        for(int i=0;i<c1.getListaPersonas().size();i++)
        {
        	System.out.println(c1.getListaPersonas().get(i).getNombre());
        }
    }
}
