package exercise7;

import exercise7.deserialization.LocationDeserializer;
import exercise7.deserialization.ObservationDeserializer;
import exercise7.model.Location;
import exercise7.model.Observation;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;


public class TemperatureConsumer {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "tempgroup");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LocationDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ObservationDeserializer.class);

        // TODO: Create a new consumer, with the properties we've created above

        Consumer<Location, Observation> consumer = new KafkaConsumer<>(props);

        consumer.subscribe(Arrays.asList("temperature"));

        //todo explain 0 does not work.
        consumer.poll(1);
        Set<TopicPartition> assignment = consumer.assignment();
        consumer.seekToBeginning(assignment);


        while (true) {
            ConsumerRecords<Location, Observation> records = consumer.poll(Duration.ofMillis(100));

            records.forEach(record -> {

                System.out.println(record.offset());
                System.out.println(record.key());
                System.out.println(record.value());
                System.out.println(record.timestampType() + ": " + record.timestamp());

            });
            // TODO: Read records using the poll() method

            // TODO: Loop around the records, printing out each record.offset, record.key, and record.value
        }
    }

}
