package org.gimenezalan.abstractFactory.factories;

import org.gimenezalan.abstractFactory.button.Button;
import org.gimenezalan.abstractFactory.checkbox.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
