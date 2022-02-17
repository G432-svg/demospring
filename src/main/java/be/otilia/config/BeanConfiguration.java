package be.otilia.config;

import be.otilia.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.List;
import java.util.Queue;
//XML configuration
//BeanFactory Configuration
//Annotation-based Configuration

//@Autowired
//@Value
//Expression Language

//@Configuration
public class BeanConfiguration { //BeanFactory
   //    CleaningService cleaningInc = new CleaningService();
   //    Cleaner jarvis = new Cleaner();
   //    Broom broom = new Broom();

    // Dependency Injection
    // Dependency :Een afhankelijkheid, Een class kan zijn werk niet zonder zijn dependency..
    // Injection : (Iets wordt in jou gestoken) <>  Ingestion(Iets naar jezelf toebrengen)

    // Spring container "injects" objects into other objects or "dependencies".
    //Simply put ,this allows for loose coupling of components and moves the responsability of managing components onto the container.

//    @Bean
//    @Primary
//    public CleaningTool createBroom() {
//        return new Broom();
//    }

//    @Bean
//    @Qualifier(value = "mobBean")
//    @Scope("prototype")
//    public CleaningTool createMob() {
//        if(checkEnvironmentForLiquids()) return new Mob();
//        if(checkEnvForLotsofDust()) return new VacuumCleaner();
//
//        return new Broom();
//    }

//    @Bean
//    public Cleaner createCleaner(@Qualifier(value = "mobBean")CleaningTool tool){
//        Cleaner cleaner = new Cleaner();
//        cleaner.setTool(tool);
//        return cleaner;
//    }
//    @Bean
//    public Cleaner createCleanerWithBroom(CleaningTool tool){
//        Cleaner cleaner = new Cleaner();
//        cleaner.setTool(tool);
//        return cleaner;
//    }
//    @Bean
//    public Cleaner createAnotherCleaner(CleaningTool tool){
//        Cleaner cleaner = new Cleaner();
//        cleaner.setTool(tool);
//        return cleaner;
//    }
//    @Bean
//    public CleaningService createCompany(List<Cleaner> cleaners){
//        CleaningServiceImpl cs = new CleaningServiceImpl();
//        cs.addCleaner(cleaner);
//        return cs;
//    }
    @Bean
 //   @Lazy
    public CleaningService createCompany(List<Cleaner> cleaners){
         UpgradedCleaningService cs = new UpgradedCleaningService();
         cs.setCleaners(cleaners);
         return cs;
    }
//    @Bean
//    public Service CreateService(Cleaner cleaner, CleaningTool tool){
//        Service s = new AnotherService();
//        s.addCleaner(cleaner);
//        s.addTool(tool);
//        return s;
//    }


}
