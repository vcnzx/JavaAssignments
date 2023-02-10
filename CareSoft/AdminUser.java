import java.util.Date;
import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();

    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID, String role){
        super(employeeID);
        this.role = role;
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    @Override
    public boolean assignPin(int pin) {
        int pinLen = Integer.toString(pin).length();

        return pinLen == 6;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID){
        if(this.id != confirmedAuthID){
            authIncident();
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents(){
       return this.securityIncidents;
    }

    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    

    public Integer getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return this.securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }


    
}
