package com.company;

public class RabotnikWatch extends Rabotnik {
    int kol =100;
    int zarab;
    @Override
    int zarab(){return zarab;}
    @Override
    String diol (){return "Расчет по часам";}
    public RabotnikWatch(String name) {
        super(name);
        zarab =0;
    }
    @Override
    int raschet(int i){
        zarab+=i*kol;
        return i*kol;
    }
}
