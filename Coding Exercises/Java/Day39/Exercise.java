package Java.Day39;

public class Exercise {
  static class Employee {
      private String name;
      private double salary;
      private double bonusPercentage;

      public Employee(String name, double salary, double bonusPercentage){
          this.name = name;
          this.salary = salary;
          this.bonusPercentage = bonusPercentage;
      }

      public double calculateBonus() {
          return (salary * bonusPercentage) / 100;
      }
  }
}
