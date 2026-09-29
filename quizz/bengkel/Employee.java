package bengkel;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String role;

    public Employee(String employeeId, String employeeName, String role) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}