package org.gimenezalan.factoryMethod.buttons.impl;

import org.gimenezalan.factoryMethod.buttons.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button render");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows button on click");
    }
}
