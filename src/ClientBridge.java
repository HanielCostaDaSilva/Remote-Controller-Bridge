import model.device.Device;
import model.remote.BasicRemote;


public class ClientBridge {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote remote = new BasicRemote(tv);

        remote.turnOn();
        remote.volumeUp();
        remote.channelUp();

        Device radio = new Radio();
        Remote advancedRemote = new AdvancedRemote(radio);

        advancedRemote.turnOn();
        advancedRemote.volumeUp();
        advancedRemote.mute();
    }
}
