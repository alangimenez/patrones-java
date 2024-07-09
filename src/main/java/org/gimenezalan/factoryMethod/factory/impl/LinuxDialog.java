package org.gimenezalan.factoryMethod.factory.impl;

import org.gimenezalan.factoryMethod.buttons.Button;
import org.gimenezalan.factoryMethod.buttons.impl.LinuxButton;
import org.gimenezalan.factoryMethod.factory.Dialog;

public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
