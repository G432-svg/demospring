package be.otilia.service;

public class ColdCook extends Cook{
    // SaladBowls
    private  CookingTool tool;

    public void setTool(CookingTool tool) {
        this.tool = tool;
    }
    @Override
    public String toString() {
        return "ColdCook{" +
                "tool=" + tool +
                '}';
    }
}
