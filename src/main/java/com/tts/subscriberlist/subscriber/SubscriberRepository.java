package com.tts.subscriberlist.subscriber;

import org.springframework.data.repository.CrudRepository;

/*
This will import the Spring CrudRepository and the methods needed to modify
data in our database.
 */
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {



}//end SubscriberRepository interface
