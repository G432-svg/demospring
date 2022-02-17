package be.otilia.service;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Component(?)  >>
// View Layer ...>> @Controller (RestController)
// Service Layer >> @Service
// Data Layer... >> @Repository(DAO - Data Access Objects)
// Data objects .>> @Entity

@Service
@Primary
@Scope("prototype")
public class Broom implements CleaningTool {
    public Broom() {
        System.out.println("Creating a Broom object");
    }

    @PostConstruct
    public void init(){ // The name can be anything
        System.out.println("This is the init method");
    }

    @PreDestroy
    public void destruct(){
        System.out.println("I'm being destroyed...woop woop ...");

    }

    @Override
    public void clean(){
        System.out.println("Sweep sweep sweep....");

    }
}
