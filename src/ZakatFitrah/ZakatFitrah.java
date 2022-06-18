/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatFitrah;

/**
 *
 * @author muham
 */
public class ZakatFitrah {
    protected long anggota, hargaBeras, zakatUang;;
    protected double zakatBeras;
    protected String tampil;
    
    //setters 
    public void setAnggota(long a) {
        this.anggota = a;
    }
    public void setHargaBeras(long b) {
        this.hargaBeras = b;
    }
    
    //getters
    public double getZakatBeras() {
        return zakatBeras;
    }
    public long getZakatUang() {
        return zakatUang;
    }
    
    //hitung-tampil
    public void hitungZakatBeras() {
        zakatBeras = anggota * 2.5;
    }
    
    public void hitungZakatUang() {
        zakatUang = anggota * hargaBeras;
    }
    
    public String tampilZakat() {
        tampil = "Nilai Zakat Fitrah yang harus kamu tunaikan adalah berupa BERAS " + getZakatBeras() + " Kg " + "atau UANG sebesar Rp" + getZakatUang();
        return tampil;
    }
}
