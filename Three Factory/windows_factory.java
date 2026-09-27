class windows_factory extends Abstract_Factory{
    
    public os_button getButton()
    {
        return new windows_button();
    }
    public os_checkbox getcheckbox()
    {
        return new windows_checkbox();
    }
    public os_redio getredio()
    {
        return new windows_redio();
    }
}
