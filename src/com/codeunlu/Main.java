package com.codeunlu;

import com.codeunlu.model.Ucak;
import com.codeunlu.service.abstracts.BaseRezervasyonService;
import com.codeunlu.service.concretes.PegasusRezervasyon;
import com.codeunlu.service.concretes.THYRezervasyon;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Ucak ucak = new Ucak();
        ucak.setId(1);
        ucak.setBusinessKoltukSayisi(5);
        ucak.setKoltukSayisi(10);
        ucak.setKalkisZamani(LocalDateTime.of(2021,07,16,13,00));

        Map<Integer,Boolean> koltuklar = new HashMap<>();
        Map<Integer,String> koltukTuru = new HashMap<>();

        for(int i= 1; i<=ucak.getKoltukSayisi(); i++){
            if(i <= ucak.getBusinessKoltukSayisi()){
                koltuklar.put(i,false);
                koltukTuru.put(i,"Business");
            }else{
                koltuklar.put(i,false);
                koltukTuru.put(i,"Ekonomi");
            }
        }

        ucak.setKoltuklar(koltuklar);
        ucak.setKoltukTuru(koltukTuru);

        BaseRezervasyonService rezervasyonService = new PegasusRezervasyon();
        rezervasyonService.rezervasyonAl(ucak);
    }

}
