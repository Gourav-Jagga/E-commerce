package com.gjdev.api;

import com.gjdev.platform.persistance.base.repo.BaseRepository;
import com.gjdev.platform.persistance.base.repo.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {
        "com.gjdev.platform",
        "com.gjdev.api"
})
@EnableJpaRepositories(
        basePackages = "com.gjdev.platform.persistance",
        repositoryBaseClass = BaseRepository.class
)

public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
