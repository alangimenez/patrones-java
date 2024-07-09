package org.gimenezalan.factoryMethod.buttons.impl;

import org.gimenezalan.factoryMethod.buttons.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizado del boton linux");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click en el boton linux");
    }
}
