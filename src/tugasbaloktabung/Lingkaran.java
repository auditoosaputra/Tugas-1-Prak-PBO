package tugasbaloktabung;

public class Lingkaran implements MenghitungBidang{
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }
    
    @Override
    public double hitungluas() {
        double luas = Math.PI*Math.pow(jarijari,2);
        return luas;
    }

    @Override
    public double hitungkeliling() {
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
   
}
