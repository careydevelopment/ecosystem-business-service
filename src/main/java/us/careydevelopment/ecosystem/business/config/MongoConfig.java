package us.careydevelopment.ecosystem.business.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages= {"us.careydevelopment.ecosystem.business.repository"})
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${mongo.db.name}") 
    private String ecosystemDb;
    
    @Value("${mongodb.carey-ecosystem.connection}")
    private String connectionString;
    
    @Override
    protected String getDatabaseName() {
        return ecosystemDb;
    }
  
    
    @Override
    @Bean
    public MongoClient mongoClient() {
        String fullConnectionString = connectionString + "/" + ecosystemDb;
        
        MongoClient client = MongoClients.create(fullConnectionString);
        return client;
    }

}
