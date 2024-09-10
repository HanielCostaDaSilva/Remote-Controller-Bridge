package model.remote;
import model.device.Device;
import model.remote.BasicRemote;

public class BasicRemote{
    protected Device device;

    BasicRemote(){}

    public BasicRemote(Device device){
        this.device = device;
    }
    

    public boolean togglePower(){
        if(this.device.isEnabled()){
        this.device.disable();
        }
        else{
            this.device.enable();
        }
        return this.device.isEnabled();
    }


    public void volumeDown(){
        int actualVolume= this.device.getVolume();
        int newValue = (actualVolume - 1 < 0 ? 0 : actualVolume - 1);
        this.device.setVolume(newValue);
    }


    public void volumeUp(){
        int actualVolume= this.device.getVolume();
        //int newValue = (actualVolume + 1 >  ? 0 : actualVolume - 1);
        int newValue = actualVolume + 1;
        this.device.setVolume(newValue);
    }

    public void channelDown(){
        int actualChannel= this.device.getChannel();
        int newValue = (actualChannel - 1 < 1 ? 1 : actualChannel - 1);
        this.device.setChannel(newValue);
    };

    public void channelUp(){
        int actualChannel= this.device.getChannel();
        int newValue = actualChannel + 1;
        this.device.setChannel(newValue);
    }
} 