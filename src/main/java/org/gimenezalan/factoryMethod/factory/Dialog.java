package org.gimenezalan.factoryMethod.factory;

import org.gimenezalan.factoryMethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
