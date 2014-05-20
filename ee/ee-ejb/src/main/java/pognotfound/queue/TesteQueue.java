package pognotfound.queue;


import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSDestinationDefinition;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.logging.Logger;

@JMSDestinationDefinition(
        name = "java:app/jms/testeQueue",
        interfaceName = "javax.jms.Queue",
        destinationName = "TesteQueue"
)
@MessageDriven(activationConfig = {
        @ActivationConfigProperty(
            propertyName =  "destinationLookup",
            propertyValue = "jms/testeQueue"),
        @ActivationConfigProperty(
            propertyName = "destinationType",
            propertyValue = "javax.jms.Queue")
        }
)
public class TesteQueue implements MessageListener {

    @Inject
    private Logger log;

    @Override
    public void onMessage(Message message) {
        log.info(String.valueOf(message));

    }
}
