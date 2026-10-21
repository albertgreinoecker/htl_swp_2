public class Auto {
    private float spritVerbrauch;
    private float geschwindigkeit;

    public Auto() {
    }

    public float getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public float getSpritVerbrauch() {
        return spritVerbrauch;
    }

    public void beschleunige(float geschw)
    {
        geschwindigkeit += geschw ;
        spritVerbrauch += geschw*0.1;
    }

    public void bremse(float geschw)
    {
        geschwindigkeit -= geschw ;
        spritVerbrauch -= geschw*0.1;
    }

    public void anhalten()
    {
        geschwindigkeit = 0;
        spritVerbrauch = 0;
    }
}
