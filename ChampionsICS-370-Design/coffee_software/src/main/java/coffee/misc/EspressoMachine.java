package coffee.misc;

public class EspressoMachine {

    private final String espressoMachineId;

    private final String machine;

    private String location;

    private  String maintenanceDate;

    private int beverageCounter;

    private final int securityPin;  //Security PIN required to access Maintenance Menu

    public EspressoMachine(String espressoMachineId,String machine,int beverageCounter, int pin) {

        this.espressoMachineId = espressoMachineId;
        this.machine = machine;
        this.beverageCounter = beverageCounter;
        this.securityPin = pin;
    }
    public String getMachine(){
        return machine;
    }
    public String getEspressoMachineId(){
        return espressoMachineId;
    }
    public int getBeverageCounter(){
        return beverageCounter;
    }
    public String setMachine(){
        return machine;
    }
    public String setEspressoMachine(){
        return espressoMachineId;
    }
    public void setbeverageCounter(int beverageCounter){
        this.beverageCounter = beverageCounter;
    }
    public boolean validatePin(int pin) {
        return (securityPin == pin);
    }
}
