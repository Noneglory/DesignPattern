package facade;

public class Computer {
    private Memory memory;
    private CPU cpu;
    private Disk disk;

    public Computer() {
        this.memory = new Memory();
        this.cpu = new CPU();
        this.disk = new Disk();
    }

    public Computer(Memory memory, CPU cpu, Disk disk) {
        this.memory = memory;
        this.cpu = cpu;
        this.disk = disk;
    }

    public void stratup(){
        this.memory.startup();
        this.cpu.startup();
        this.disk.startup();
    }

    public void shutdown(){
        this.memory.startup();
        this.cpu.shutdown();
        this.disk.shutdown();
    }
}
