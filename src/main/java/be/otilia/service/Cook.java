package be.otilia.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Primary
@Scope("prototype")
public class Cook {
    //HotCook >> Uses pots,pans
    //ColdCook >> Uses SaladBowls
    private CookingTool tool;
}
