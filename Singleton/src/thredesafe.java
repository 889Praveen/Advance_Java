class thredesafe {
  static thredesafe instance =null;
  
    private  thredesafe()
    {}
    public static thredesafe getobject()
  {
      if(instance == null)
    {
        synchronized(thredesafe.class)
        {
            if(instance == null)
            {
               instance=new thredesafe();
             return instance;
            }
        }
    }
    return null;
}
public String mesessge()
{
     return "Threadsafe object creation  Sucessfully....!";
}
}
