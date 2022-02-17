package be.otilia.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UpgradedGardeningService implements GardeningService{

    private Collection<Gardener> gardeners = new ArrayList<>();

    public UpgradedGardeningService() {
        System.out.println("Creating the upgraded gardening service");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException ignored) {
//        }
    }
    public Collection<Gardener> getGardeners() {
            return gardeners;
    }

    public UpgradedGardeningService setGardeners(Collection<Gardener> gardeners) {
            this.gardeners = gardeners;
            return this;
    }
    public void addGardener(Gardener gardener){
            gardeners.add(gardener);
    }

    @Override
    public void doGardening() {
        gardeners.forEach(gardener -> gardener.doJob());
    }
}


