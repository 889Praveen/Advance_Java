 class singleton {
static singleton instance=null;

singleton()
{

}
     
public static singleton getobject()
{
    if(instance == null)
    {
        instance=new singleton();
        return instance;
    }
    return null;
}
public String mesessge()
{
     return "Singlelton object creation  Sucessfully....!";
}
}