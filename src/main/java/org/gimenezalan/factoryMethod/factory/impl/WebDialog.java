package org.gimenezalan.factoryMethod.factory.impl;

import org.gimenezalan.factoryMethod.buttons.Button;
import org.gimenezalan.factoryMethod.buttons.impl.WebButton;
import org.gimenezalan.factoryMethod.factory.Dialog;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
