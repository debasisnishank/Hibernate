import java.util.*;

public class students {

    private Integer sid;
    private String sname;
    private String saddr;
    private Set courselist;
     public students(){}
    public students( String sname, String saddr, Set courselist) {
       
        this.sname = sname;
        this.saddr = saddr;
        this.courselist = courselist;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

    public Set getCourselist() {
        return courselist;
    }

    public void setCourselist(Set courselist) {
        this.courselist = courselist;
    }

}