public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote (Device device){
        super(device);
    }
    
    public AdvancedRemote (){
        super();
    }

    public void mute(){
        this.device.setVolume(0);
    }

}