package app.demo.service;

import core.framework.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Painter {
    private final Logger logger = LoggerFactory.getLogger(Painter.class);

    @Inject
    Brush brush;

    public void invoke() {
        logger.warn("drawing picture...");
        brush.outPut();
    }

}
