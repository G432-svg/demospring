package be.otilia;

import be.otilia.service.GardeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"be.intec"})
public class DemoApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DemoApplication.class, args);
        // Application Context >> (Classes en Objecten)= Beans (Application Objects) managen
        // Persistence Context  / EM >> Entities (Data Objecten) Managen

        ConfigurableApplicationContext ctx =
                 SpringApplication.run(DemoApplication.class, args);

//        GardeningService gs = ctx.getBean(GardeningService.class);
//        gs.doGardening();

//        CookingService cks = ctx.getBean(CookingService.class);
//        cks.doColdCooking();
//        cks.doHotCooking();

        ctx.close();



//        CleaningService cs = ctx.getBean(CleaningService.class);
//        cs.doCleaning();

//        CleaningService cleaningInc = new CleaningService();
//        Cleaner jarvis = new Cleaner();
//        Broom broom = new Broom();
//
//        jarvis.setTool(broom);
//        cleaningInc.addCleaner(jarvis);
//
//        cleaningInc.doCleaning();
    }

}
//Lifecycles(e.g. humans)
//1.Birth
//2.Baby
//3.Child
//4.Teenager(this is where the
//5.Adult
//6.2nd Teenage - midlife
//7.Old age
//8.Death
//9.?????(i don't know)

//Lifecycle( object)
//1.Instantiation(new)
//2.Initialization of variables in object(optional)
//3.Use of object
//4.Garbage Collection( cleaning up phase)


//Lifecycle(beans)
//1.Instantiation(new)
//2.Initialization of variables in object(optional)
//2.5 Init method is called -@PostConstruct
//3. Use of object
//3.5 Clean up ,prepare for garbage collection @PreDestroy
//4. Garbage Collection( cleaning up phase)



