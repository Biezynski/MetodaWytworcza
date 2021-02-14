package com.biezynski;

import java.util.HashMap;
import java.util.Map;

public class CarFactory implements ICarFactory {


    Map<String, ICar> mapa = new HashMap<String, ICar>(){{
       put("Opel", new Opel());
       put("Mazda", new Mazda());
    }};


    @Override
    public ICar makeCar(String name) {
        return mapa.get(name);
    }
}