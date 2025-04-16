//package DesignPattern.Adapter;

public class Crowadapter implements swan{
    private crow CrowObj;
    public Crowadapter(crow TempCrow){
        this.CrowObj=TempCrow;
    }
    @Override
    public void Sing() {
        CrowObj.cry();
    }
    @Override
    public void eat() {
        CrowObj.eat();
    }
    @Override
    public void Swim() {
        CrowObj.fly();
    }
}
