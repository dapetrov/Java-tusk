package com.company;

public class RabotnikMonth extends Rabotnik {
    int kol =30000;
    int zarab;
    @Override
    int zarab(){return zarab;}
    @Override
    String diol (){return "Расчет по месяцам";}

    public RabotnikMonth(String name) {
        super(name);
        zarab =0;
    }
    @Override
    int raschet(int i){
        zarab+=i*kol;
        return i*kol;
    }
}
