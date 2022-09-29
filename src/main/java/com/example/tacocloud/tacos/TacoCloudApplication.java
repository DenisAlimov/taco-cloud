package com.example.tacocloud.tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Составная аннотация, включает в себя:
 * 1) @SpringBootConfiguration - определяет этот класс как класс конфигурации. Если понадобится, в этот класс можно добавить
 * настройки конфигурации Spring Framework. По сути - это специализированная форма аннотации "@Configuration".
 * 2) @EnableAutoConfiguration - включает автоконфигурацию SpringBoot. Все компоненты будут настраиваться автоматически.
 * 3) @ComponentScan - включает сканирование компонентов (Spring будет искать классы, помеченные аннотациями
 * "@Component, @Controller, @Service".
 */
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }
}