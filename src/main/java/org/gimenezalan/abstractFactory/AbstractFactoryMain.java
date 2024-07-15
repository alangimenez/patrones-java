package org.gimenezalan.abstractFactory;

import org.gimenezalan.abstractFactory.factories.GuiFactory;
import org.gimenezalan.abstractFactory.factories.impl.LinuxFactory;
import org.gimenezalan.abstractFactory.factories.impl.MacFactory;
import org.gimenezalan.abstractFactory.factories.impl.WinFactory;

public class AbstractFactoryMain {
    private Application application;
    private GuiFactory factory;

    public void executeAbstractFactory() {
        // factory = new WinFactory();
        // factory = new MacFactory();
        factory = new LinuxFactory();
        application = new Application(factory);

        application.paint();
    }
}
