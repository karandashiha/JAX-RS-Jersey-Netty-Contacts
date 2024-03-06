package org.example.app;

import org.example.app.config.NettyServerProvider;
import org.example.app.service.impl.ContactService;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER =
            Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws MalformedURLException {

        final String httpServer = NettyServerProvider.startHttpServer(
                // Один ресурс
//                ContactService.class
                // Або декілька ресурсів
                ContactService.class
        );

        LOGGER.log(Level.INFO, httpServer);
    }
}
