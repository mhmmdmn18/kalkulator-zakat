/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatMaal;

/**
 *
 * @author muham
 */
public class ZakatPenghasilan extends ZakatMaal implements Nisab {
    protected long harta1, harta2, hutang, totalHasil;
    protected double zakatHasil, nisab;
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
    public void setHutang(long hutang) {
        this.hutang = hutang;
    }
    
    @Override
    public void setHarta3(long harta) {}
    @Override
    public void setHarta4(long harta) {}
    
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
    public long getHutang() {
        return hutang;
    }
    @Override
    public long getTotal() { 
        return totalHasil;
    }
    @Override
    public double getZakat() { 
        return (long) zakatHasil;
    }
    @Override
    public double getHargaEmas() {
        return (long) hargaEmas;
    }
    @Override
    public double getNisab() {
        return (long) nisab;
    }
    
    @Override
    public long getHarta3() {return 0;}
    @Override
    public long getHarta4() {return 0;}
    
    //hitung-tampil
    @Override
    public void hitungZakat() {
        totalHasil = (harta1 + harta2) - hutang;
        zakatHasil = totalHasil * 0.025;
        if (zakatHasil % 1 != 0) zakatHasil += 1;
        if (totalHasil < nisab) zakatHasil = 0;
    }

    @Override
    public String tampilZakat() {
        long zh = (long) zakatHasil;
        String zakat = Long.toString(zh);
        
        if (totalHasil > nisab) {
            tampil = "Nilai Zakat Penghasilan (dibulatkan) yang harus kamu tunaikan per bulan adalah sebesar Rp" + zakat;
            return tampil;
        } else {
            tampil = "";
            return tampil;
        }
    }

    @Override
    public void hitungNisab() {
        nisab = hargaEmas * 85 / 12;
        if (nisab % 1 != 0) nisab += 1;
    }

    @Override
    public String ketWajib() {
        if (totalHasil > nisab) {
            wajib = "Kamu diwajibkan menunaikan Zakat Penghasilan karena telah melebihi nisab. ";
            return wajib;
        } else {
            wajib = "Kamu tidak diwajibkan menunaikan Zakat Penghasilan karena belum melebihi nisab";
            return wajib;
        }
    }
}
