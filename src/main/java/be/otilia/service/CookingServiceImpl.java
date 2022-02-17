package be.otilia.service;

import java.util.ArrayList;
import java.util.List;

public class CookingServiceImpl implements CookingService,HouseHoldService{
    private List<Cook> cooks = new ArrayList<>();

    public void addCook(Cook cook){
        this.cooks.add(cook);
    }


    @Override
    public void doHotCooking() {

    }

    @Override
    public void doColdCooking() {

    }

    @Override
    public void doJob() {
        System.out.println("This is doing a job");
    }
}
