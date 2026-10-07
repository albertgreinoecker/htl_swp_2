public class SwitchEnum {
    enum HIMMELSRICHTUNG {NORDEN, OSTEN, SUEDEN, WESTEN} ;
    HIMMELSRICHTUNG hr = HIMMELSRICHTUNG.OSTEN;

    static void himmelsRichtungStr(HIMMELSRICHTUNG hr)
    {
        switch (hr)
        {
            case NORDEN :
                System.out.println("Norden");
                break;
            case SUEDEN :
                System.out.println("Sueden");
                break;
            case WESTEN :
                System.out.println("Westen");
                break;
            case OSTEN :
                System.out.println("Osten");
                break;
        }
    }


    static void wochentagSwitch(int tag)
    {
        String tagStr = "";
        switch (tag)
        {
            case 1: tagStr = "Montag";
            case 2: tagStr = "Dienstag";
            case 3: tagStr = "Mittwoch";
            case 4: tagStr = "Donnerstag";
            case 5: tagStr = "Freitag";
            case 6: tagStr = "Samstag";
            case 7: tagStr = "Sonntag";
        }
        System.out.println(tagStr);
    }

    static void wochenendSwitch(int tag)
    {
        boolean wochenende = false;
        switch (tag)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: wochenende = false; break;
            case 6:
            case 7: wochenende = true;
        }
        System.out.println(wochenende);
    }


    public static void main(String[] args) {
        wochentagSwitch(5);
        HIMMELSRICHTUNG hr =  HIMMELSRICHTUNG.valueOf("NORDEN");
        System.out.println(hr);

        for (HIMMELSRICHTUNG hri : HIMMELSRICHTUNG.values())
        {
            System.out.println(hri);
        }

    }
}
