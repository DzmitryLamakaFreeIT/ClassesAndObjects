package by.lamaka.lesson6.computer;

public class Computer {
    /*15. Создать класс Computer с внутренним классом, с помощью объектов кото-
    рого можно хранить информацию об операционной системе, процессоре
    и оперативной памяти.*/
    private String name;
    private String model;
    private ComputerInfo computerInfo;

    public Computer() {
    }

    public Computer(String name, String model, String os, String cpu, String ram) {
        computerInfo = new ComputerInfo();
        this.name = name;
        this.model = model;
        computerInfo.os = os;
        computerInfo.cpu = cpu;
        computerInfo.ram = ram;

    }

    class ComputerInfo {
        private String os;
        private String cpu;
        private String ram;

    }

    public void setOs(String os) {
        computerInfo.os = os;
    }

    public void setCpu(String cpu) {
        computerInfo.cpu = cpu;
    }

    public void setRam(String ram) {
        computerInfo.ram = ram;
    }

    public String getOs() {
        return computerInfo.os;
    }

    public String getCpu() {
        return computerInfo.cpu;
    }

    public String getRam() {
        return computerInfo.ram;
    }

    public String getAllInfo() {
        return "Name : " + name + "\nModel : " + model + "\nOS : " + computerInfo.os + "\nCPU : " +
                computerInfo.cpu + "\nRAM : " + computerInfo.ram;
    }
}
