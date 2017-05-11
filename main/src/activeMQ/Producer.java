package activeMQ;

import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.*;

/**
 * ActiveMQ message producer
 */
public class Producer {
    public static void main(String[] args) {

        ConnectionFactory connectionFactory;
        Connection connection;
        Session session;
        Destination destination;
        MessageProducer producer;

        try {
            connectionFactory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);
            destination = session.createQueue("Test-Queue");
            producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            MqBean bean = new MqBean();

            for(int i=0; i<100; i++){
                bean.setName("Bean No." + i);
                producer.send(session.createObjectMessage(bean));
            }

            producer.close();
            System.out.println("呵呵");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
