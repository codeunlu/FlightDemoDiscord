package com.codeunlu.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

public class Ucak {
    private int id;
    private int koltukSayisi;
    private int businessKoltukSayisi;
    private Map<Integer, Boolean> koltuklar;
    private Map<Integer, String> koltukTuru;
    private LocalDateTime kalkisZamani;

    public Ucak(){

    }

    public Ucak(int id, int koltukSayisi, int businessKoltukSayisi, Map<Integer, Boolean> koltuklar, LocalDateTime kalkisZamani) {
        this.id = id;
        this.koltukSayisi = koltukSayisi;
        this.businessKoltukSayisi = businessKoltukSayisi;
        this.koltuklar = koltuklar;
        this.kalkisZamani = kalkisZamani;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        if(koltukSayisi < 10){
            koltukSayisi = 10;
        }
        this.koltukSayisi = koltukSayisi;
    }

    public int getBusinessKoltukSayisi() {
        return businessKoltukSayisi;
    }

    public void setBusinessKoltukSayisi(int businessKoltukSayisi) {
        this.businessKoltukSayisi = businessKoltukSayisi;
    }

    public Map<Integer, Boolean> getKoltuklar() {
        return koltuklar;
    }

    public void setKoltuklar(Map<Integer, Boolean> koltuklar) {
        this.koltuklar = koltuklar;
    }

    public LocalDateTime getKalkisZamani() {
        return kalkisZamani;
    }

    public void setKalkisZamani(LocalDateTime kalkisZamani) {
        this.kalkisZamani = kalkisZamani;
    }

    public Map<Integer, String> getKoltukTuru() {
        return koltukTuru;
    }

    public void setKoltukTuru(Map<Integer, String> koltukTuru) {
        this.koltukTuru = koltukTuru;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "id=" + id +
                ", koltukSayisi=" + koltukSayisi +
                ", businessKoltukSayisi=" + businessKoltukSayisi +
                ", koltuklar=" + koltuklar +
                ", koltuklarTuru=" + koltukTuru +
                ", kalkisZamani=" + kalkisZamani +
                '}';
    }
}
