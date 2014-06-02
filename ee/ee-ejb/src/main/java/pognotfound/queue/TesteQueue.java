package pognotfound.queue;


import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.logging.Logger;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java:jboss/exported/jms/queue/testQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
        ,@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "10")
        }
)
public class TesteQueue implements MessageListener {

    @Inject
    private Logger log;

    public static int COUNTS = 0;

    @Override
    public void onMessage(Message message) {
        COUNTS++;
        log.info(COUNTS + "|" + String.valueOf(message));
        throw new RuntimeException();
    }
}
