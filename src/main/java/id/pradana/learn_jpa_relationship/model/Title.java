package id.pradana.learn_jpa_relationship.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "titles")
@Entity
public class Title extends BaseModel {
  @Id
  @Column(name = "emp_no", nullable = false, length = 11)
  private Long employeeNo;

  @Column(name = "title", nullable = false, length = 50)
  private String title;

  public Long getEmployeeNo() {
    return employeeNo;
  }

  public void setEmployeeNo(Long employeeNo) {
    this.employeeNo = employeeNo;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
