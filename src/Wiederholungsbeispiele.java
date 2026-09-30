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

    static void lottoStatistik()
    {
        int[] statistik = new int[46];

        for (int i = 0; i < 5000;i++)
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

    }
    public static void main(String[] args)
    {
        lottoStatistik();
    }

}
