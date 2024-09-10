package model.device;

public abstract class Device{
    private boolean on = false;
    private int channel = 1;
    private int volume = 50;

    public boolean isEnabled(){
        return this.on;
    }
    
    public void enable(){
        this.on = true;
    }
    public void disable(){
        this.on = false;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int percent){
        this.volume= percent;
    };
    public int getChannel(){
        return this.channel;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }
    
    public abstract  void printStatus();

    @Override
    public String toString() {
        String status = isEnabled() ? "on" : "off";
        return "Device status: " + status + ", Volume: " + volume + ", Channel: " + channel;
    }
}