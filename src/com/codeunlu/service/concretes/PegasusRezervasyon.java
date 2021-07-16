package com.codeunlu.service.concretes;

import com.codeunlu.model.Ucak;
import com.codeunlu.service.abstracts.BaseRezervasyonService;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PegasusRezervasyon implements BaseRezervasyonService {
    private int koltukNumarasi;
    @Override
    public void rezervasyonAl(Ucak ucak) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koltik Tipi Seçiniz?");
        System.out.println("1- Business \n2- Ekonomi");
        int secim = scanner.nextInt();

        if(secim == 1){
            System.out.println(ucak.getKoltukTuru());
            while (true){
                koltukNumarasi = scanner.nextInt();
                boolean koltukDoluluk = ucak.getKoltuklar().get(koltukNumarasi);
                if(!koltukDoluluk){
                    ucak.getKoltuklar().put(koltukNumarasi,true);
                    System.out.println(ucak.getKoltuklar() + "\n" + ucak.getKoltukTuru());
                }else{
                    System.out.println("Koltuk malesef dolu!");
                }
            }
        }else if(secim == 2){
            System.out.println(ucak.getKoltukTuru());
            Random random = new Random();
            int rastgeleKoltuk = random.nextInt(ucak.getKoltukSayisi());
            while(true){
                if("Ekonomi".equals(ucak.getKoltukTuru().get(rastgeleKoltuk)) && ucak.getKoltuklar().get(rastgeleKoltuk) == false){
                    ucak.getKoltuklar().put(rastgeleKoltuk,true);
                    System.out.println(ucak.getKoltuklar());
                    break;
                }else{
                    System.out.println("Koltuklar doludur!");
                    break;
                }
            }
        }
    }
}
