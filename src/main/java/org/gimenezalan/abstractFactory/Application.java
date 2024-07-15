package org.gimenezalan.abstractFactory;

import org.gimenezalan.abstractFactory.button.Button;
import org.gimenezalan.abstractFactory.checkbox.Checkbox;
import org.gimenezalan.abstractFactory.factories.GuiFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
