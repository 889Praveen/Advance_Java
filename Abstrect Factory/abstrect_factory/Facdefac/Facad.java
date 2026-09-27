public class Facad {
    private lighting lf;
    private cooling cl;
    private movie mp;

    public Facad()
    {
        lf=new lighting();
        cl=new cooling();
        mp=new movie();
    }
    public void WatchMovie()
    {
        lf.lighOff();
        cl.acOn();
        mp.moviePlay();
    }
}
