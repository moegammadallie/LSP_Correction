package LSP_Correction;

/*
We can extend TransportationDevice for non-motorized devices
 */
public class DevicesWithoutEngines extends TransportationDevice {
    void startMoving() {
        System.out.println("Starts moving!!");
    }
}
