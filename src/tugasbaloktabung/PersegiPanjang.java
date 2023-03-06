package tugasbaloktabung;

public class PersegiPanjang implements MenghitungBidang{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    @Override
    public double hitungluas() {
        double luas = panjang*lebar;
        return luas;
    }

    @Override
    public double hitungkeliling() {
        double keliling = 2*(panjang+lebar);
        return keliling;
    }
    
}
