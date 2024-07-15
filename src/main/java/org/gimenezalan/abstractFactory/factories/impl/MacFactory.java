package org.gimenezalan.abstractFactory.factories.impl;

import org.gimenezalan.abstractFactory.button.Button;
import org.gimenezalan.abstractFactory.button.impl.MacButton;
import org.gimenezalan.abstractFactory.checkbox.Checkbox;
import org.gimenezalan.abstractFactory.checkbox.impl.MacCheckbox;
import org.gimenezalan.abstractFactory.factories.GuiFactory;

public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
