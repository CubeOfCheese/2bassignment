public class employee
{
  private employeeRecord info;

  public employee()
  {
    info = new employeeRecord();
  }
  public employee(String firstName, String lastName, double payRate, double hoursWorked)
  {
    info = new employeeRecord(firstName, lastName, payRate, hoursWorked);
  }
  public getEmployee()
  {
    return info;
  }
}
