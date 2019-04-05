package com.dichotome;

import com.dichotome.model.SubscriberInfo;
import com.dichotome.model.Subscriber;

public class Data {
    private Subscriber[] subscribers = {
            new Subscriber("Pavlo", "Oleksandrovych", "Bohdan", null, null),
            new Subscriber("Stepan", "Olehovych", "Koval", 74114141, null, new SubscriberInfo(
                    "Ukraine", 19, "Software engineer"
            )),
            new Subscriber("Olena", "Andriyivna", "Svytiaz", 79009213, "Yangelia street, 20"),
            new Subscriber("Petro", "Ihorovych", "Antoniuk", 78990988, "Metalistiv street, 15")
    };

    public Subscriber[] getSubscribers() {
        return subscribers;
    }
}
