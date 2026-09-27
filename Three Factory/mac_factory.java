public class mac_factory extends Abstract_Factory {
    public os_button getButton()
    {
        return new mac_button();
    }
    public os_checkbox getcheckbox()
    {
        return new mac_checkbox();
    }
    public os_redio getredio()
    {
        return new linux_redio();
    }
}
