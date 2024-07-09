package org.gimenezalan.factoryMethod.buttons.impl;

import org.gimenezalan.factoryMethod.buttons.Button;

public class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
