package example.kafka.consumer;

import example.kafka.dto.AlertDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(KafkaProcessor.class)
public class KafkaConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

  @StreamListener(KafkaProcessor.ALERT_INPUT)
  public void process(AlertDto alertDto) {
    LOGGER.info("Let's process employee details: {}", alertDto);
  }

}
