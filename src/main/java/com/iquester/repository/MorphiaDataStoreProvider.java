package com.iquester.repository;

import com.iquester.domain.model.Quest;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:env.properties")
@Component
public class MorphiaDataStoreProvider {

    @Autowired
    private Environment environment;

    private Datastore datastore;

    @PostConstruct
    private void initialize() {

        Morphia morphia = new Morphia();
        morphia.mapPackage("com.iquester.dao.model");

        final String mongoUri = environment.getProperty("mongodb.uri");
        MongoClient mongoClient;
        if(!StringUtils.isEmpty(mongoUri)) {
            MongoClientURI mongoClientURI = new MongoClientURI(mongoUri);
            datastore = morphia.createDatastore(
                    new MongoClient(mongoClientURI), mongoClientURI.getDatabase());
        } else {
            mongoClient = new MongoClient(
                    environment.getProperty("mongodb.host"),
                    environment.getProperty("mongodb.port", Integer.class));
            datastore = morphia.createDatastore(mongoClient, environment.getProperty("mongodb.db"));
        }
        datastore.ensureIndexes();

        generateTestData();
    }

    public Datastore getDataStore() {
        return datastore;
    }

    /**
     * Temp function
     */
    private void generateTestData() {
        DBCollection questsCollection = datastore.getCollection(Quest.class);
        if(questsCollection != null) {
            questsCollection.drop();
        }
        datastore.save(new Quest("1", "Around Westminster"));
        datastore.save(new Quest("2", "Lovely Greenwich"));
    }
}
