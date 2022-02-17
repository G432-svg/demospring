package be.otilia.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Primary
@Scope("prototype")
public class Shovel implements GardeningTool{
    public void Shovel(){
        System.out.println("Creating a Shovel object");

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
    public void garden() {
        System.out.println("Hash, hash, hash...");
    }
}
