package Demodecoratore;

abstract class abdecoratore implements Componet {
    Componet object;
    public abdecoratore(Componet obj)
    {
           object=obj;
    }
    public void abovemethodcoll()
    {
         object.basicomponet();
    }
}
