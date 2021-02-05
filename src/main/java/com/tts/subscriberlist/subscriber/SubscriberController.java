package com.tts.subscriberlist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @GetMapping(value = "/")
    public String index(Subscriber subscriber) {
        //Where we want to go when our application is started - a template called "index"
        // in the subscriber template directory.
        return "subscriber/index";
    }

    /*
    Set up another method that will take in the data entered in the form and
    add it to the database.
    This method will post the information to the database and display a
    "confirmation" on a new template called "result".
     */
    private Subscriber subscriber;
    @PostMapping(value = "/")
    public String addNewSubscriber(Subscriber subscriber, Model model) {
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(),
                subscriber.getLastName(), subscriber.getUserName(), subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        return "subscriber/result";
    }

}//end SubscriberController class
