package org.acme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GreetingEntity {

    @Id
    @GeneratedValue
    public Long id;

    public String text;
}
