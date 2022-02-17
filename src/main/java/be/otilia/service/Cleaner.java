package be.otilia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Primary
@Scope("prototype")
public class Cleaner {
    // Stofzuiger, bezem, CleaningProducts(Javel, Allersreiniger, Zeep,...),Dweil

    private CleaningTool tool;

    //userInput = "'Patrick';DROP TABLE Person;"
    // "SELECT * FROM Person WHERE login LIKE" + userInput;
    // "SELECT * FROM Person WHERE login LIKE 'Patrick';SELECT * FROM Person;"

    @Value("${value1}")
    private Integer valueInjection;

    //https://docs.spring.io/spring-framework/docs/5.3.8/reference/html/core.html#expressions
    @Value(("#SpEL"))
    private Integer logicalInjection;
    public Cleaner(){

    }
    @Autowired(required = false)
    public void setTool(CleaningTool tool) {
        this.tool = tool;

    }

    public void doJob() {
       this.tool.clean();
    }
}
