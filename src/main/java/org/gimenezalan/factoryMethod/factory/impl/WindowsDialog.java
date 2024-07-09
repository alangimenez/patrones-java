package org.gimenezalan.factoryMethod.factory.impl;

import org.gimenezalan.factoryMethod.buttons.Button;
import org.gimenezalan.factoryMethod.buttons.impl.WindowsButton;
import org.gimenezalan.factoryMethod.factory.Dialog;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
