package tugasbaloktabung;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
       
    @Override
    public double hitungluaspermukaan() {
        double luaspermukaan = 2*(super.getPanjang()*super.getLebar()+super.getPanjang()*tinggi+super.getLebar()*tinggi);
        return luaspermukaan;                
    }

    @Override
    public double hitungvolume() {
        double volume = super.hitungluas()*tinggi;
        return volume;
    }
    
    
}
