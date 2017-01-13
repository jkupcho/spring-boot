package com.code.slingers.config;

import com.code.slingers.PersonRepository;
import com.code.slingers.TopicRepository;
import com.code.slingers.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabasePopulator implements CommandLineRunner {

    private final TopicRepository topicRepository;
    private final PersonRepository personRepository;

    @Autowired
    public DatabasePopulator(TopicRepository topicRepository, PersonRepository personRepository) {
        this.topicRepository = topicRepository;
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        topicRepository.save(new Topic("ELK Stack", "ELKs go moo"));
    }

}
