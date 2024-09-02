package model.remote;
import model.device.Device;
import model.remote.BasicRemote;

public class BasicRemote{
    Device device;

    BasicRemote(){}

    BasicRemote(Device device){
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


    void volumeDown(){
        int actualVolume= this.device.getVolume();
        int newValue = (actualVolume - 1 < 0 ? 0 : actualVolume - 1);
        this.device.setVolume(newValue);
    }


    void volumeUp(){
        int actualVolume= this.device.getVolume();
        //int newValue = (actualVolume + 1 >  ? 0 : actualVolume - 1);
        int newValue = actualVolume + 1;
        this.device.setVolume(newValue);
    }

    void channelDown(){
        int actualChannel= this.device.getChannel();
        int newValue = (actualChannel - 1 < 1 ? 1 : actualChannel - 1);
        this.device.setChannel(newValue);
    };

    void channelUp(){
        int actualChannel= this.device.getChannel();
        int newValue = actualChannel + 1;
        this.device.setChannel(newValue);
    }
} 