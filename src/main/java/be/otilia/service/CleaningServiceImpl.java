package be.otilia.service;

import java.util.ArrayList;
import java.util.List;

public class CleaningServiceImpl implements CleaningService, HouseHoldService {
    private List<Cleaner> cleaners = new ArrayList<>();

    public void addCleaner(Cleaner cleaner) {
        this.cleaners.add(cleaner);
    }

    public void doCleaning(){
        for(Cleaner cleaner : cleaners){
            cleaner.doJob();
        }
        this.cleaners.forEach(cleaner -> cleaner.doJob());
    }

    @Override
    public void doJob() {
        System.out.println("This service is now doing a job");
    }
}
