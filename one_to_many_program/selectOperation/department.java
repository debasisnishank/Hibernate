
import java.util.*;

public class department {
    private Integer dept_id;
    private String dept_name;
    private String dept_loc;
    private Set employees;

    public department() {

    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;

    }

    public Integer getDept_id() {
        return dept_id;
    }

    public Set getEmployees() {
        return employees;
    }

    public void setEmployees(Set employees) {
        this.employees = employees;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_loc(String dept_loc) {
        this.dept_loc = dept_loc;
    }

    public String getDept_loc() {
        return dept_loc;
    }

}