package dk.via.jaxwssoapservice.client;

import dk.via.jaxwssoapservice.service.WakeUpMessageService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL WSDL_URL = new URL("http://localhost:9090/jaxws-wakeup-service?wsdl");
        // dk.via.jaxwssoapservice.service.WakeUpMessageService
        QName SERVICE_NAME = new QName("http://service.jaxwssoapservice.via.dk/",
                "WakeUpMessageService");
        // Create the CXF supplied service
        Service service = Service.create(WSDL_URL, SERVICE_NAME);
        System.out.println("SOAP Service now created ...");
        // now you can consume the service
        // Obtain the service interface by using the getPort method
        WakeUpMessageService ws = service.getPort(WakeUpMessageService.class);
        System.out.println("=================================");
        System.out.println(ws.wakeUp("Himay Sashy"));
        System.out.println("=================================");
    }
}
