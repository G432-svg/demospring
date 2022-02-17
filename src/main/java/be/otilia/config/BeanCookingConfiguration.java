package be.otilia.config;

import be.otilia.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

//@Configuration
public class BeanCookingConfiguration {

//    @Bean
//    public CookingTool createPot(){
//        return new Pot();
//    }
    @Bean
    public CookingTool createPan(){
        return new Pan();

    }
    public HotCook createHotCook(CookingTool tool){
        HotCook hotCook = new HotCook();
        hotCook.setTool(tool);
        return hotCook;
    }
    public ColdCook createColdCook(CookingTool tool){
        ColdCook coldCook = new ColdCook();
        coldCook.setTool(tool);
        return coldCook;
    }
    @Bean
    public CookingService createCompany3(List<Cook> cooks){
        CookingServiceImpl cks = new CookingServiceImpl();
//        Cook cook;
//        cks.addCook(cook);
        return cks;
    }
    @Bean
    public GardeningService createCompany2(List<Gardener> gardeners){
        UpgradedGardeningService gs = new UpgradedGardeningService();
        gs.setGardeners(gardeners);
        return gs;
    }


}
