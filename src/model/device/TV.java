package model.remote;
import model.device.Device;

public class TV extends Device{
    boolean smartTV =false;
    
    
    public void smartTVOn(){
        this.smartTV =true;
    }
    
    public void smartTVOff(){
        this.smartTV =false;
    }


    
    @Override
    public void printStatus(){
            System.out.println("------------------------------------");
            System.out.println("| Eu sou uma Televisão :)");
            System.out.println("| Ativado: " + (this.isEnabled() ? "Sim" : "Não"));
            System.out.println("| SmartTV Ativado: " + (this.smartTV ? "Sim" : "Não"));
            System.out.println("| Volume: " + this.getVolume() + "%");
            System.out.println("| Canal Atual: " + this.getChannel());
            System.out.println("------------------------------------\n");
        }
}