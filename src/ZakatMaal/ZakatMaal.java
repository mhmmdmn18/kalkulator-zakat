/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatMaal;

/**
 *
 * @author muham
 */
public abstract class ZakatMaal {
    
    //setters
    protected abstract void setHarta1(long harta);
    protected abstract void setHarta2(long harta);
    protected abstract void setHarta3(long harta);
    protected abstract void setHarta4(long harta);
    protected abstract void setHutang(long hutang);
    
    //getters
    protected abstract long getHarta1();
    protected abstract long getHarta2();
    protected abstract long getHarta3();
    protected abstract long getHarta4();
    protected abstract long getHutang();
    protected abstract long getTotal();
    protected abstract double getZakat();
    
    //hitung-tampil
    protected abstract void hitungZakat();
    protected abstract String tampilZakat();
}
