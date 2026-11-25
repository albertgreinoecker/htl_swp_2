package auto;

public class AutoRennen {
    public static void main(String[] args) {
        Auto a1 = new Auto(10,100);
        System.out.println(a1.getGeschwindigkeit());

        Auto a2 = new Auto(20,200);
        System.out.println(a2.getGeschwindigkeit());
        a2 = a1;
        a1.setGeschwindigkeit(300);

        //a2 = null;
        // 1000 Zeilen später
        //a2.setGeschwindigkeit(100);


        Auto a3 = null;
        // 1000 Zeilen später
        a3 = new Auto(100,200);
        System.out.println(a3.getSpritVerbrauch());

        Reifen reifen = new Reifen(100);
        //a3.setReifen(reifen);

        a3.getReifen().getDurchmesser();

        Reifen r = a3.getReifen();
        r.getDurchmesser();

        Auto[] autos = new Auto[4];
        autos[0]= a3;
        autos[1] = new Auto(100,200);
        autos[2] = new Auto(400,200);
        autos[3] = new Auto(500,200);

        for (int i = 0; i < autos.length; i++) {
            Auto a = autos[i];
        }

        for (Auto a : autos)
        {

        }

    }
}
