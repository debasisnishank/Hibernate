import java.util.*;

public class courses {
    private Integer cid;
    private String c_name;
    private Integer c_duration;
    private Set studentlist;

    public courses() {
    }

    public courses(String c_name, Integer c_duration, Set s) {
    this.c_duration = c_duration;
    this.c_name = c_name;
    studentlist = s;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Integer getC_duration() {
        return c_duration;
    }

    public void setC_duration(Integer c_duration) {
        this.c_duration = c_duration;
    }

    public Set getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(Set studentlist) {
        this.studentlist = studentlist;
    }

}
