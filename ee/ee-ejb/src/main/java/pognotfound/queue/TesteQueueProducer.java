package pognotfound.queue;


import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import java.util.logging.Logger;

@Stateless
public class TesteQueueProducer {

    @Inject
    private Logger log;

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "jms/testeQueue")
    private Queue queue;

}
