package musikvw;

public class MusikVW {
    private Cd[]  cds;
    int pos = 0;

    public MusikVW()
    {
        cds = new Cd[1000];
    }


    public void addCd(Cd cd)
    {
        cds[pos++] = cd;
    }

    public void ausgabe()
    {
        for(int i = 0; i < pos;i++)
        {
            //cds[i].ausgabe();
            cds[i].ausgabe();
        }
    }
}
