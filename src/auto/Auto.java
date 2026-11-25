package auto;

public class Auto {

    private float spritVerbrauch;
    private float geschwindigkeit;
    private Reifen reifen;
    public Auto() {
        this.spritVerbrauch = 10;
    }

    public Auto(float spritVerbrauch, float geschwindigkeit)
    {
        this.spritVerbrauch = spritVerbrauch;
        this.geschwindigkeit = geschwindigkeit;
    }

    public Reifen getReifen() {
        return reifen;
    }

    public void setReifen(Reifen reifen) {
        this.reifen = reifen;
    }

    public float getSpritVerbrauch() {
        return spritVerbrauch;
    }

    public void setSpritVerbrauch(float spritVerbrauch) {
        this.spritVerbrauch = spritVerbrauch;
    }

    public float getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(float geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
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
