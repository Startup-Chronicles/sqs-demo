package io.startupchronicles.sqsdemo.consumer;

import io.startupchronicles.sqsdemo.model.ProcessingRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SqsConsumer {

    @SqsListener("sqs-demo")
    public void processMessage(final ProcessingRequest message){
        log.info("Received message {}", message);
    }
}
