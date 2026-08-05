class Employee:
    language= "Python"# class attribute
    salary = 1200000# class attribute

sarthak = Employee()# creating an object of class Employee
sarthak.name = "Sarthak"
print(sarthak.name,sarthak.language,sarthak.salary)
ram= Employee()# creating another object of class Employee  
ram.name = "Ram"
print(ram.name,ram.language,ram.salary)
# here name is instance attribute and language and salary are class attributes as they directly belong to class and we can access them by object also.
