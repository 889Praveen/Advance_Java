abstract class Abstract_Factory {

    abstract os_button getButton();
    abstract os_checkbox getcheckbox();
    abstract os_redio getredio();
  
    public static Abstract_Factory getComponent(String ostype)
        {
            Abstract_Factory var=null;
            switch (ostype.toLowerCase()) {
                case "windows":
                           var= new windows_factory();
                            break;
                case "mac":
                          var=new mac_factory();
                          break;
                case "linux":
                           var= new linux_factory();
                            break;
                default:
                        System.out.println("Enter valid OS.......!");
                    break;
               
            }
                        return var;
        
    }
  
}
