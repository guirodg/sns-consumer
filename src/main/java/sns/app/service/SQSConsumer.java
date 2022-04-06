package sns.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Service
public class SQSConsumer {
  private static final Logger LOGGER = LoggerFactory.getLogger(SQSConsumer.class);


  @JmsListener(destination = "teste")
  public void receive(TextMessage textMessage) throws JMSException {
    LOGGER.info("AQUI >>> {}", textMessage.getText());
  }
}
