package net.tajzich.spock

import spock.lang.Specification

import java.nio.channels.AlreadyBoundException

class ConsumerTest extends Specification {

    Consumer consumer

    def "should consume 1"() {

        given:

        consumer = new Consumer()

        NullPointerException exception = new NullPointerException('test NPE')

        when:

        boolean result = consumer.consume(exception)

        then:

        !result
    }

    def "should consume 2"() {


        given:

        consumer = new Consumer()

        when:

        boolean result = consumer.consume(exception)

        then:

        !result

        where:

        exception << [new RuntimeException(), new AlreadyBoundException()]
    }
}
