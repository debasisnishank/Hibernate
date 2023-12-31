public class Employee2{
private Integer empid;
private String empname;
private PersonalDetail personalDetail;


public void setEmpid(Integer empid){
this.empid = empid;
}
public Integer getEmpid(){
return empid;
}

public void setEmpname(String empname){
this.empname = empname;
}
public String getEmpname(){
return empname;
}

public void setPersonalDetail(PersonalDetail pd){
personalDetail = pd;
}
public PersonalDetail getPersonalDetail(){
return personalDetail;
}

}