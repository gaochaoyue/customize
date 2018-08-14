package com.segmentfault.springcloudlesson3configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient1Application {

    //private final ContextRefresher contextRefresher;
/*
    @Autowired
    public SpringCloudLesson3ConfigClientApplication(ContextRefresher contextRefresher) {
        this.contextRefresher = contextRefresher;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient1Application.class, args);
    }

    /**
     * 定时刷新配置
     */
    /*@Scheduled(fixedRate = 1000L)
    public void update() {

        Set<String> keys = contextRefresher.refresh();

        if (!keys.isEmpty()) {
            System.out.println("本次更新的配置项: " + keys);
        }

    }*/


    /**
     * 自定义/health 检测信息
     * @return
     */
    /*@Bean
    public MyHealthIndicator myHealthIndicator() {
        return new MyHealthIndicator();
    }

    private class MyHealthIndicator implements HealthIndicator {

        @Override
        public Health health() {
            Health.Builder builder = Health.status(Status.UP);
            builder.withDetail("name", "MyHealthIndicator");
            builder.withDetail("timestamp", System.currentTimeMillis());
            return builder.build();
        }
    }*/

}
