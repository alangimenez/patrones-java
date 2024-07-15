package org.gimenezalan.abstractFactory.factories.impl;

import org.gimenezalan.abstractFactory.button.Button;
import org.gimenezalan.abstractFactory.button.impl.LinuxButton;
import org.gimenezalan.abstractFactory.checkbox.Checkbox;
import org.gimenezalan.abstractFactory.checkbox.impl.LinuxCheckbox;
import org.gimenezalan.abstractFactory.factories.GuiFactory;

public class LinuxFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
