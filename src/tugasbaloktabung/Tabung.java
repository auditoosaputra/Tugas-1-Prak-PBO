package tugasbaloktabung;

public class Tabung extends Lingkaran implements MenghitungRuang{
    double tinggi;

    public Tabung(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungluaspermukaan() {
        double luaspermukaan = 2*Math.PI*super.getJarijari()*(super.getJarijari()+tinggi);
        return luaspermukaan;
    }

    @Override
    public double hitungvolume() {
        double volume = super.hitungluas()*tinggi;
        return volume;
    }

}
