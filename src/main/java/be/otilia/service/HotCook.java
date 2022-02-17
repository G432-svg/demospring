package be.otilia.service;

public class HotCook extends Cook{
    // Pots, Pans
    private CookingTool tool;

    public void setTool(CookingTool tool){
        this.tool = tool;

    }
    public void doJob(){
        this.tool.cook();
    }


}
