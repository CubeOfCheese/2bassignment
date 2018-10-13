public class employeeRecord
{
  public String lastName;
  public String firstName;
  public double payRate;
  public double hoursWorked;

  public employeeRecord()
  {
    lastName = "Bond";
    firstName = "James";
    payRate = 0;
    hoursWorked = 0;
  }
  public employeeRecord(String aFirstName, String aLastName)
  {
    firstName = aFirstName;
    lastName = aLastName;
    payRate = 0;
    hoursWorked = 0;
  }
  public employeeRecord(String aFirstName, String aLastName, double aPayRate)
  {
    firstName = aFirstName;
    lastName = aLastName;
    payRate = aPayRate;
    hoursWorked = 0;
  }
  public employeeRecord(String aFirstName, String aLastName, double aPayRate, double aHoursWorked)
  {
    firstName = aFirstName;
    lastName = aLastName;
    payRate = aPayRate;
    hoursWorked = aHoursWorked;
  }
}
