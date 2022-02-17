package be.otilia.service;

import java.util.ArrayList;
import java.util.List;

public class GardeningServiceImpl implements GardeningService,HouseHoldService{
    private List<Gardener> gardeners = new ArrayList<>();

    public void addGardener(Gardener gardener) {
        this.gardeners.add(gardener);
    }

    public void doGardening(){
        for(Gardener gardener : gardeners){
            gardener.doJob();
        }
        this.gardeners.forEach(gardener -> gardener.doJob());
    }

    @Override
    public void doJob() {
        System.out.println("This is doing a job");
    }
}
