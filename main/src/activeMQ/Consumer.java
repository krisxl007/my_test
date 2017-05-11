package activeMQ;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * ActiveMQ message consumer
 */
public class Consumer {
    public static void main(String[] args) {

        ConnectionFactory connectionFactory;
        Connection connection;
        Session session;
        Destination destination;
        MessageConsumer consumer;

        try {
            connectionFactory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("Test-Queue");
            consumer = session.createConsumer(destination);
            consumer.setMessageListener(message -> {
                try {
                    Thread.sleep(1000);
                    MqBean bean = (MqBean) ((ObjectMessage)message).getObject();
                    if (null != message) {
                        System.out.println("收到消息" + bean.getName());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
