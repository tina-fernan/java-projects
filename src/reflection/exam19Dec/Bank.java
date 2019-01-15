package weekSeven.exercise01.exam19Dec;

import java.util.List;

public class Bank {

    String employeeNames;
    String departmentNames;
    Integer salary;
    Integer bankAccount;



    public Integer getSalary() {
        return salary;
    }

    public Bank(String employeeNames, String departmentNames, Integer salary, Integer bankAccount) {
        this.employeeNames = employeeNames;
        this.departmentNames = departmentNames;
        this.salary = salary;
        this.bankAccount = bankAccount;
    }


    public String getEmployeeNames() {
        return employeeNames;
    }

    public String getDepartmentNames() {
        return departmentNames;
    }

    public Integer getBankAccount() {
        return bankAccount;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "employeeNames='" + employeeNames + '\'' +
                ", departmentNames='" + departmentNames + '\'' +
                ", salary=" + salary +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
