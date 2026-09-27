class linux_factory extends Abstract_Factory{
    public os_button getButton()
    {
        return new linux_button();
    }
    public os_checkbox getcheckbox()
    {
        return new linux_checkbox();
    }
    public os_redio getredio()
    {
        return new linux_redio();
    }
}
