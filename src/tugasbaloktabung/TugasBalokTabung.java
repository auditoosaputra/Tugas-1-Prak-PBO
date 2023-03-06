package tugasbaloktabung;

import java.util.Scanner;

public class TugasBalokTabung {

    public static void main(String[] args) {
        boolean loop = true;
        int menu, ulang;
        double panjang, lebar, tinggi, jarijari;
        Scanner program = new Scanner(System.in);
        
        while(loop){
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            
            System.out.print("Pilih : ");
            
            menu = program.nextInt();
            switch(menu){
                case 1 : 
                    System.out.print("Input Panjang : ");
                    panjang = program.nextDouble();                    
                    System.out.print("Input Lebar : ");
                    lebar = program.nextDouble();
                    System.out.print("Input Tinggi : ");
                    tinggi = program.nextDouble();
                    PersegiPanjang rectangle = new PersegiPanjang(panjang, lebar);
                    Balok block = new Balok(panjang, lebar, tinggi);
                    System.out.println("Luas Persegi Panjang : " + rectangle.hitungluas());
                    System.out.println("Keliling Persegi Panjang : " + rectangle.hitungkeliling());
                    System.out.println("Volume Balok : " + block.hitungvolume());
                    System.out.println("Luas Permukaan Balok : " + block.hitungluaspermukaan());
                    System.out.print("Kembali ke menu? (Ya: 1 || Tidak: 0)");
                    ulang = program.nextInt();
                    if(ulang != 1){
                        loop = false;
                    }
                    break;
                case 2 : 
                    System.out.print("Input Tinggi : ");
                    tinggi = program.nextDouble();
                    System.out.print("Input Jari-jari : ");
                    jarijari = program.nextDouble();
                    Lingkaran circle = new Lingkaran(jarijari);
                    Tabung tube = new Tabung(tinggi, jarijari);
                    System.out.println("Luas Lingkaran : " + circle.hitungluas());
                    System.out.println("Keliling Lingkaran : " + circle.hitungkeliling());
                    System.out.println("Volume Tabung : " + tube.hitungvolume());
                    System.out.println("Luas Permukaan Tabung : " + tube.hitungluaspermukaan());
                    System.out.print("Kembali ke menu? (Ya: 1 || Tidak: 0)");
                    ulang = program.nextInt();
                    if(ulang != 1){
                        loop = false;
                    }
                    break;
                case 0 :
                    loop = false;
                    break;
                default :
                    System.out.println("Menu yang Anda pilih tidak tersedia!");
                    System.out.print("Kembali ke menu? (Ya: 1 || Tidak: 0)");
                    ulang = program.nextInt();
                    if(ulang != 1){
                        loop = false;
                    }
                    break;
            }
        }
        System.out.println("Program berakhir...");
        program.close();
    }
}
