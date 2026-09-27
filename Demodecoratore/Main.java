package Demodecoratore;

public class Main {
    public static void main(String[] args) {
     basic obj1=new basic();
     //obj1.basicomponet();
     decoratore1 objDecoratore1=new decoratore1(obj1);
     //objDecoratore1.basicomponet();
     decoratoer2 objDecoratoer2=new decoratoer2(objDecoratore1);
     objDecoratoer2.basicomponet();
    }
}
