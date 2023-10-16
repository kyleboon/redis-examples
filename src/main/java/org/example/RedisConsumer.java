package org.example;

import redis.clients.jedis.JedisPooled;
import redis.clients.jedis.JedisPubSub;

public class RedisConsumer {
    public static void main(String[] args) throws InterruptedException {
        JedisPooled jedis = new JedisPooled("localhost", 6379);

        JedisPubSub consumer1 = new JedisPubSub() {
            @Override
            public void onPMessage(String pattern, String channel, String message) {
                System.out.println("Consumer 1 received message: " + message + " from channel: " + channel);
            }
        };

        new Thread(() -> {
            jedis.psubscribe(consumer1, "fruits*");
        }).start();

        Thread.sleep(1000); // everyone loves race conditions!

        jedis.publish("fruits:apple", "apple");
        jedis.publish("fruits:banana", "banana");
        jedis.publish("nonfruits", "should not get this message");

        consumer1.punsubscribe("fruits*");

        jedis.close();
    }
}
