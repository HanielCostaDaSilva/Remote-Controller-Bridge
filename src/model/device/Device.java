package model.remote;

public interface Device{
    private boolean on = false;
    private int channel = 1;
    private int volume = 50;

    boolean isEnabled(){
        return this.on;
    }
    
    void enable(){
        this.on = true;
    }
    void disable(){
        this.on = false;
    }

    int getVolume(){
        return this.volume;
    }

    void setVolume(int percent){
        this.volume= percent;
    };
    String getChannel(){
        return this.channel;
    }

    void setChannel(int channel){
        this.channel = channel;
    }
    
    public abstract void printStatus();

    @Override
    public String toString() {
        String status = isEnabled() ? "on" : "off";
        return "Device status: " + status + ", Volume: " + volume + ", Channel: " + channel;
    }
}