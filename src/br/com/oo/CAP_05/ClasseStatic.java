package br.com.oo.CAP_05;

/**
 * @author William
 */
public class ClasseStatic
{
    private static int contador;
    
    //-----------------------------------------------------------------------//
    // CONSTRUCTORS
    
    public ClasseStatic (String texto)
    {
        System.out.println (texto);
        contador++;
    }
    
    //-----------------------------------------------------------------------//
    // GETTERS / SETTERS

    public static int getContador ()
    {
        return contador;
    }
}