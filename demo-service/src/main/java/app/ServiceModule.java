package app;

import app.demo.service.Brush;
import app.demo.service.Painter;
import core.framework.module.Module;

public class ServiceModule extends Module {

    @Override
    protected void initialize() {
        bind(new Brush());
        Painter painter = bind(new Painter());

        painter.invoke();
    }

}
