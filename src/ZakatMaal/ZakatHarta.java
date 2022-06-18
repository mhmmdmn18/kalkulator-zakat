/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatMaal;

/**
 *
 * @author muham
 */
public class ZakatHarta extends ZakatMaal implements Nisab {
    protected long harta1, harta2, harta3, harta4, hutang, totalHarta;
    protected double zakatHarta, nisab;
    protected String tampil, wajib;
    
    //setters
    @Override
    public void setHarta1(long harta1) {
        this.harta1 = harta1;
    }
    @Override
    public void setHarta2(long harta2) {
        this.harta2 = harta2;
    }
    @Override
    public void setHarta3(long harta3) {
        this.harta3 = harta3;
    }
    @Override
    public void setHarta4(long harta4) {
        this.harta4 = harta4;
    }
    @Override
    public void setHutang(long hutang) {
        this.hutang = hutang;
    }
    
    //getters
    @Override
    public long getHarta1() {
        return harta1;
    }
    @Override
    public long getHarta2() {
        return harta2;
    }
    @Override
    public long getHarta3() {
        return harta3;
    }
    @Override
    public long getHarta4() {
        return harta4;
    }
    @Override
    public long getHutang() {
        return hutang;
    }
    @Override
    public long getTotal() { 
        return totalHarta;
    }
    @Override
    public double getZakat() { 
        return zakatHarta;
    }
    @Override
    public double getHargaEmas() {
        return hargaEmas;
    }
    @Override
    public double getNisab() {
        return nisab;
    }
    
    //hitung-tampil
    @Override
    public void hitungZakat() {
        totalHarta = (harta1 + harta2 + harta3 + harta4) - hutang;
        zakatHarta = totalHarta * 0.025;
        if (zakatHarta % 1 != 0) zakatHarta += 1;
        if (totalHarta < nisab) zakatHarta = 0;
    }

    @Override
    public String tampilZakat() {
        long zh = (long) zakatHarta;
        String zakat = Long.toString(zh);
        
        if (totalHarta > nisab) {
            tampil = "Nilai Zakat Harta (dibulatkan) yang harus kamu tunaikan per tahun adalah sebesar Rp" + zakat;
            return tampil;
        } else {
            tampil = "";
            return tampil;
        }
    }

    @Override
    public void hitungNisab() {
        nisab = hargaEmas * 85;
        if (nisab % 1 != 0) nisab += 1;
    }

    @Override
    public String ketWajib() {
        if (totalHarta > nisab) {
            wajib = "Kamu diwajibkan menunaikan Zakat Harta karena telah melebihi nisab. ";
            return wajib;
        } else {
            wajib = "Kamu tidak diwajibkan menunaikan Zakat Harta karena belum melebihi nisab";
            return wajib;
        }
    }
}
