# jmsRmqCitrus
PoC for citrus and JMS client for RabbitMQ

run instruction

mvn clean integration-test -Dtest=RabbitMQ


Spring beans definitions are in citrus-context.xml in test/resources

RabbitMQ 3.6.6, Erlang 19.2 +plugin rabbitmq_jms_topic_exchange
