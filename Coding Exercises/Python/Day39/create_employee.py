def create_employee(name, salary, bonus_percentage):
    employee = {
        'name': name,
        'salary': salary,
        'bonus_percentage': bonus_percentage
    }
    return employee


def calculate_bonus(employee):
    return (employee['salary'] * employee['bonus_percentage']) / 100
