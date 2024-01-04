public class emp {
    private Integer empid;
    private String empname;
    private Double esal;
    private Integer dept_id;
    private department departments;

    public emp() {

    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Double getEsal() {
        return esal;
    }

    public void setEsal(Double esal) {
        this.esal = esal;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public department getDepartments() {
        return departments;
    }

    public void setDepartments(department departments) {
        this.departments = departments;
    }

}