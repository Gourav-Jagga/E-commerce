package com.gjdev.db;

import org.flywaydb.core.Flyway;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class FlywayRunner implements ApplicationRunner {

    private final DataSource dataSource;
    private final Environment env;

    public FlywayRunner( DataSource dataSource, Environment env) {
        this.dataSource = dataSource;
        this.env = env;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Flyway flyway = Flyway.configure()
                .dataSource(dataSource)
                .schemas(env.getProperty("spring.flyway.default-schema"))
                .baselineOnMigrate(true)
                .locations("classpath:db/"+getDatabaseType(dataSource)+"/migration/seed")
                .load();
        flyway.migrate();
    }
    private String getDatabaseType(DataSource dataSource) throws SQLException {
        try (Connection conn = dataSource.getConnection()) {
            String dbProductName = conn.getMetaData().getDatabaseProductName().toLowerCase();
            if (dbProductName.contains("postgresql")) {
                return "postgres";
            } else if (dbProductName.contains("oracle")) {
                return "oracle";
            } else if (dbProductName.contains("mysql")) {
                return "mysql";
            } else {
                throw new IllegalStateException("Unsupported DB: " + dbProductName);
            }
        }
    }
}
