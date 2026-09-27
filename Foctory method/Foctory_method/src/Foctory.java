abstract class Foctory {
    public static  employee getdevloper(String devlopertype)
    {
        if(devlopertype=="androd")
        {
            return new andriddevloper();
        }
        else
        {
        if (devlopertype=="web") 
        {
            
          return new webdevloper();
        }
    }
    return null;
    }
}
