package dk.via.jaxwssoapservice.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Random;

@WebService(endpointInterface = "dk.via.jaxwssoapservice.service.WakeUpMessageService",
        serviceName = "WakeUpMessageService")
public class WakeUpMessageServiceImpl implements WakeUpMessageService {

    @Override
    public String wakeUp(@WebParam(name="name") String name) {
        return getRandomMessage() + ", " + name;
    }

    private String getRandomMessage() {
        ArrayList<String> wakeUpMsgs = new ArrayList<String>();
        wakeUpMsgs.add("Have a good day");
        wakeUpMsgs.add("It's gonna be okay");
        wakeUpMsgs.add("Don't worry, be happy");
        wakeUpMsgs.add("Here is a warm coffee, just for you");
        String msg = wakeUpMsgs.get(new Random().nextInt(wakeUpMsgs.size()));
        return msg;
    }
}
