package be.otilia.config;

import be.otilia.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

//@Configuration
public class GardeningConfiguration {

//    @Bean
//    @Primary
//    public GardeningTool createRake(){
//        return new Rake();
//    }

    @Bean
    @Qualifier(value = "shovelBean")
    public GardeningTool createShovel(){
        return new Shovel();
    }

    public Gardener createGardener(@Qualifier(value = "shovelBean")GardeningTool tool){
        Gardener gardener = new Gardener();
        gardener.setTool(tool);
        return gardener;
    }

//    @Bean
//    public GardeningService createCompany2(List<Gardener> gardeners){
//        GardeningServiceImpl gs = new GardeningServiceImpl();
//        gs.addGardener(gardener);
//        return gs;
//    }
    @Bean
    public GardeningService createCompany2(List<Gardener> gardeners){
        UpgradedGardeningService gs = new UpgradedGardeningService();
        gs.setGardeners(gardeners);
        return gs;
    }

}
