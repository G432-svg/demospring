package be.otilia.service;

public class Gardener {
    //Rake,Shovel,Scissor...
    private GardeningTool tool;

    public void setTool(GardeningTool tool) {
        this.tool = tool;

    }
    public void doJob() {
        this.tool.garden();
    }
}
