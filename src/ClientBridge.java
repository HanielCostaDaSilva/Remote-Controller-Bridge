import model.device.Device;
import model.device.DigitalRadio;
import model.device.TV;
import model.remote.AdvancedRemote;
import model.remote.BasicRemote;


public class ClientBridge {
    public static void main(String[] args) {
        Device tv = new TV();
        BasicRemote remote = new BasicRemote(tv);

        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
        System.out.println(tv);
        
        Device radio = new DigitalRadio();
        
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        System.out.println(radio);
        
        remote.togglePower();
        advancedRemote.mute();
        System.out.println(radio);
    }
}
