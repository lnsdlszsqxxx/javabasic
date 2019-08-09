package mygroup;

class Employee implements Comparable<Employee>{
    private int age;
    private String name;
    private int salary;
    private String department;


    public Employee(int age, String name, int salary, String department) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Employee e){
        return this.age - e.age;
    }

    @Override
    public String toString(){
        return this.age + " " + this.name + " " + this.salary + " " + this.department;
    }




}
