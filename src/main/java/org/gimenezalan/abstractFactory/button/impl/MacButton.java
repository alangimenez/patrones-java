package org.gimenezalan.abstractFactory.button.impl;

import org.gimenezalan.abstractFactory.button.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Esta dibujando un boton Mac");
    }
}
