package com.imryao.server;

public class Main {
    public static void main(String[] args) {
        RedisHandler handler = new RedisHandler("shard://10.10.10.7:6379").connect();
    }
}