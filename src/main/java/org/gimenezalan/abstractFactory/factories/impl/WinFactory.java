package org.gimenezalan.abstractFactory.factories.impl;

import org.gimenezalan.abstractFactory.button.Button;
import org.gimenezalan.abstractFactory.button.impl.WinButton;
import org.gimenezalan.abstractFactory.checkbox.Checkbox;
import org.gimenezalan.abstractFactory.checkbox.impl.WinCheckbox;
import org.gimenezalan.abstractFactory.factories.GuiFactory;

public class WinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
