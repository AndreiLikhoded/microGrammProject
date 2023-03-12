package com.example.microGram.entity;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Subscriber {
    private User userSubscriberId;
    private User subscriberTo;
    private LocalDateTime dateSubscribe;


    public Subscriber(User userSubscriberId, User subscriberTo, LocalDateTime dateSubscribe) {
        this.userSubscriberId = userSubscriberId;
        this.subscriberTo = subscriberTo;
        this.dateSubscribe = dateSubscribe;
    }
}
