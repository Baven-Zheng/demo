package app;

import core.framework.module.App;

public class DemoServiceApp extends App {
    @Override
    protected void initialize() {

        load(new ServiceModule());

    }
}
