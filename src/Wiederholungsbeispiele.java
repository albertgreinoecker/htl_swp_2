public class Wiederholungsbeispiele {

    static boolean kommtVor(int[] a, int z)
    {
        for (int i = 0; i <a.length; i++) {
            if (a[i] == z)
            {
                return true;
            }
        }
        return false;
    }
    static int[] lottoZahlen()
    {
        int[] lz = new int[6];   //Erzeuge Array der groesse 6
        int i = 0;
        while (i < 6) //gehe alle Stellen im Array durch
        {
            int z = (int)(Math.random()*45) + 1; //erzeuge Zufallszahl

            if (!kommtVor(lz, z))
            {
                lz[i] = z; //stelle diese Zufallszahl in das Array an die Stelle i
                i++; // erhoehe die Laufvariable i
            }
        }
        return lz; //gib das erstellte Array zurueck
    }

    static int[] lottoStatistik(int anzahl)
    {
        int[] statistik = new int[46];

        for (int i = 0; i < anzahl;i++)
        {
            int[] lz = lottoZahlen();

            for (int z : lz)
            {
                statistik[z]++;
            }
        }

        for (int i = 1; i < statistik.length;i++)
        {
            System.out.printf("%d : %d %n", i, statistik[i]);
        }
        return statistik;
    }

    static double durchschnitt(int[] werte)
    {
        double sum = 0;
        for(int w : werte)
        {
            sum += w; //sum = sum + w;
        }
        return sum / werte.length;
    }

    static void lottoAuswertung(int[] lottoStat)
    {
        double sum = 0;
        for (int ls : lottoStat)
        {
            sum += ls;
        }
        double durch = sum / lottoStat.length -1;
        System.out.println("Durchschnitt:" + durch);
        for (int i = 1; i < lottoStat.length;i++)
        {
            int ls = lottoStat[i];
            System.out.printf("%d:  %.2f %n", i, Math.abs(ls - durch));
        }
    }
    public static void main(String[] args)
    {
        int[] lottoStat = lottoStatistik(5000);
        lottoAuswertung(lottoStat);
        //int[] a = {1,454,2,6,3,8};
        //double durch = durchschnitt(a);
        //System.out.printf("Durchschnitt: %.2f ", durch);
    }

}
