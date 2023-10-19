interface Employee {
  name: string;
  salary: number;
  bonusPercentage: number;
}

function createEmployee(name: string, salary: number, bonusPercentage: number): Employee {
  return {
      name,
      salary,
      bonusPercentage
  };
}

function calculateBonus(employee: Employee): number {
  return (employee.salary * employee.bonusPercentage) / 100;
}
