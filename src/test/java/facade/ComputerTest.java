package facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    Computer computer = new Computer();
    @Test
    public void stratup() {
        computer.stratup();
    }

    @Test
    public void shutdown() {
        computer.shutdown();
    }
}