package be.otilia.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Service
@Primary
@Scope("prototype")
public class Pot implements CookingTool {
    public Pot(){
        System.out.println("Pot was created");
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
    public void cook() {
        System.out.println("Pot, pot, pot...");

    }
}
