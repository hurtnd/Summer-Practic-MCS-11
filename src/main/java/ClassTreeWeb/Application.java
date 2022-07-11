package ClassTreeWeb;

import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

/**
 * Console application.
 */
public class Application {

    public static void main(String[] argv) {
        startWebServer();
    }

    /**
     * Starting web-server.
     */
    private static void startWebServer() {
        UndertowJaxrsServer server = new UndertowJaxrsServer().start();
        server.deploy(WebApplication.class);
        System.out.println("Server started: http://localhost:8081/");
    }
}
