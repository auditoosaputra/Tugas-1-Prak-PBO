package tugasbaloktabung;

public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi;

    public Tabung(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
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
