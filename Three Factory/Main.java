import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        Abstract_Factory var;
       Scanner objScanner=new Scanner(System.in);
       System.out.println("Enter OS Name:");
       String osname=objScanner.next();
        var=Abstract_Factory.getComponent(osname);

       os_button button=var.getButton();
        button.createbutton();

       os_checkbox ceCheckbox=var.getcheckbox();
       ceCheckbox.createcheckboc();

       os_redio redio =var.getredio();
       redio.createredio();

    }
}
