import javax.persistence.*;
@Entity
public class student{
    @Id
private Integer sid;
private String sname;
private String saddr;
private String smob;
private Double sfee;

public student(){
                }
//getter and setter
public Integer getSid(){
return sid;
}
public void setSid(Integer sid){
this.sid = sid;
}

public String getSname(){
return sname;
}
public void setSname(String sname){
this.sname = sname;
}

public String getSaddr(){
return saddr;
}

public void setSaddr(String saddr){
this.saddr = saddr;
}

public String getSmob(){
return smob;
}
public void setSmob(String smob){
this.smob = smob;
}
public Double getSfee(){
return sfee;
}
public void setSfee(Double sfee){
this.sfee = sfee;
}
}