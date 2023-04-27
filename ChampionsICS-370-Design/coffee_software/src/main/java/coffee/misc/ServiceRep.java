package coffee.misc;

public class ServiceRep {

    public String repName;
    private String repId;

    public ServiceRep(String repName, String repId) {
        this.repName=repName;
        this.repId=repId;
    }

    protected void maintenance( int machineID, String location, String date, String message){
        /*Future Development.
        Could contain Error Log in the message */
    }

    public String getRepId() {

        return repId;
    }

    public void setRepId(String repId) {
        this.repId = repId;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }
}
