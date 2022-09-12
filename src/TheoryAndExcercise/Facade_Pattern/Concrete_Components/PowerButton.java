package TheoryAndExcercise.Facade_Pattern.Concrete_Components;

/**
 * This is the facade class
 */
public class PowerButton {
    private CPU cpu;
    private HardDisk hardDisk;
    private  Monitor monitor;

    public PowerButton(){
        this.connectCPU();
        this.connectMonitor();
        this.connectHardDisk();
    }

    private void connectCPU(){
        if(cpu == null)
            cpu = new CPU();
    }

    private void connectHardDisk(){
        if(hardDisk == null)
            hardDisk = new HardDisk();
    }

    private void connectMonitor(){
        if(monitor == null)
            monitor = new Monitor();
    }

    public void pressed(){
        cpu.turnOnSequence();
        hardDisk.turnOnSequence();
        monitor.turnOnSequence();
    }
}
