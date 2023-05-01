package lab8_composite;

public abstract class Employee  {
  private String name;
  private double salary;

  
  public abstract void add(Employee employee);
  public abstract void remove(Employee employee);
  public abstract Employee getChild(int i);
    
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName(){
    return this.name;
  };
  public double getSalary(){
    return this.salary;
  };

  public void print() {
    System.out.println("Name ="+getName());
    System.out.println("Salary ="+getSalary());
  }




}

