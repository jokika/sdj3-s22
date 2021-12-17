package dk.via.jaxwssoapservice.server;

import dk.via.jaxwssoapservice.service.WakeUpMessageServiceImpl;

import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        WakeUpMessageServiceImpl service = new WakeUpMessageServiceImpl();
        String address = "http://localhost:9090/jaxws-wakeup-service";
        Endpoint.publish(address, service);

        System.out.println("********  The Server is ready ... ******");
        System.out.println("========================================");
        try {
            Thread.sleep(5 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("******** Exiting the Server ...");
        System.exit(0);
    }
}
