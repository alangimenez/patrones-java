package org.gimenezalan.factoryMethod;

import org.gimenezalan.factoryMethod.factory.Dialog;
import org.gimenezalan.factoryMethod.factory.impl.LinuxDialog;
import org.gimenezalan.factoryMethod.factory.impl.WebDialog;
import org.gimenezalan.factoryMethod.factory.impl.WindowsDialog;

public class FactoryMethodMain {
    private static Dialog dialog;
    public void executeFactoryMethodMain() {
        dialog = new WindowsDialog();
        dialog.renderWindow();

        dialog = new WebDialog();
        dialog.renderWindow();

        dialog = new LinuxDialog();
        dialog.renderWindow();
    }
}
