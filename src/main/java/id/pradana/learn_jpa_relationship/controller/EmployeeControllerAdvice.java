package id.pradana.learn_jpa_relationship.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackageClasses = EmployeeController.class)
public class EmployeeControllerAdvice extends ResponseEntityExceptionHandler {
  @ExceptionHandler({ Exception.class, RuntimeException.class })
  public void handleException(Exception ex) {
    ex.printStackTrace();
  }
}
