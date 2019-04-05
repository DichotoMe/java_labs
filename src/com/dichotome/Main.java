package com.dichotome;

import com.dichotome.controller.Controller;
import com.dichotome.model.Subscriber;
import com.dichotome.model.SubscriberInfo;

public class Main {
    public static void main(String[] args) {
        Data source = Data.getInstance()
                .add(new Subscriber("Pavlo", "Oleksandrovych", "Bohdan", null, null))
                .add(new Subscriber("Stepan", "Olehovych", "Koval", 74114141, null, new SubscriberInfo(
                        "Ukraine", 19, "Software engineer"
                )))
                .add(new Subscriber("Olena", "Andriyivna", "Svytiaz", 79009213, "Yangelia street, 20"))
                .add(new Subscriber("Petro", "Ihorovych", "Antoniuk", 78990988, "Metalistiv street, 15"));

        Controller controller = new Controller(source.getSubscribers());
        controller.init();
    }
}
