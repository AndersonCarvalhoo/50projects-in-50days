package entities;

import java.util.ArrayList;

import entities.enums.WorkerLevel;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;
  private String departament;

  private ArrayList<HourContract> contracts = new ArrayList<HourContract>();

  public Worker(String name, WorkerLevel level, Double baseSalary, String departament) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.departament = departament;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public String getDepartament() {
    return departament;
  }

  public void setDepartament(String departament) {
    this.departament = departament;
  }

  public ArrayList<HourContract> getContracts() {
    return contracts;
  }

  public void addContract(HourContract contract) {

  }

  public void removeContract(HourContract contract) {

  }

  public Double income(Integer year, Integer month) {
    return 3.2;
  }
}
