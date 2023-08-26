package id.pradana.learn_jpa_relationship.filter;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeFilterDTO {
  @Override
  public String toString() {
    return "EmployeeFilterDTO [id=" + id + ", fullname=" + fullname +
        ", birthdate=" + birthdate + ", hiredate=" + hiredate + "]";
  }

  @JsonProperty("employee_id")
  private String id;

  @JsonProperty("employee_fullname")
  private String fullname;

  @JsonProperty("employee_birthdate")
  @JsonFormat(pattern = "dd-MMM-yyyy")
  private Date birthdate;

  @JsonProperty("employee_hiredate")
  @JsonFormat(pattern = "dd-MMM-yyyy")
  private Date hiredate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public Date getHiredate() {
    return hiredate;
  }

  public void setHiredate(Date hiredate) {
    this.hiredate = hiredate;
  }
}
