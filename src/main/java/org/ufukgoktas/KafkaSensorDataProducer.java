package org.ufukgoktas;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaSensorDataProducer {
    private Producer<String, String> kafkaProducer;

    public KafkaSensorDataProducer() {
        kafkaProducer = new KafkaProducer<>(KafkaConfig.getConfig());
    }

    public void sendSensorData(String topic, String key, String data) {
        kafkaProducer.send(new ProducerRecord<>(topic, key, data));
    }

    public void close() {
        kafkaProducer.close();
    }
}
