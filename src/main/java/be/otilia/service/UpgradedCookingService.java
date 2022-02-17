package be.otilia.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UpgradedCookingService implements CookingService{
   private Collection<HotCook> hotCooks = new ArrayList<>();
   private Collection<ColdCook> coldCooks = new ArrayList<>();

    public UpgradedCookingService() {
        System.out.println("Creating the upgraded cooking service");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ignored) {
//        }
    }

    public Collection<HotCook> getHotCooks() {
        return hotCooks;
    }

//    public UpgradedCookingService setHotCooks(Collection<HotCook> hotCooks) {
//        this.hotCooks = hotCooks;
//        return hotCooks;
//    }

    public Collection<ColdCook> getColdCooks() {
        return coldCooks;
    }

//    public UpgradedCookingService setColdCooks(Collection<ColdCook> coldCooks) {
//        this.coldCooks = coldCooks;
//        return coldCooks;
//    }

    @Override
    public void doHotCooking() {
        hotCooks.forEach(hotCook -> hotCook.doJob());

    }

    @Override
    public void doColdCooking() {
//        coldCooks.forEach(coldCook -> coldCook.doJob());

    }
}
