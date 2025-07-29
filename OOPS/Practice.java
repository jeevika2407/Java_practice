package oops.practice;
class Person {
    private String name;
    private String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAddress() {
        return address;
    }

    String getName() {
        return name;
    }
}
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    void setProgram(String program) {
        this.program = program;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setFee(double fee) {
        this.fee = fee;
    }

    int getYear() {
        return year;
    }

    double getFee() {
        return fee;
    }

    public String toString() {
        return "Student[Person[name="+getName()+",address="+ getAddress()+"],program="+program+", year="+year+",fee="+fee + "]";
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    void setPay(double pay) {
        this.pay = pay;
    }

    void setSchool(String school) {
        this.school = school;
    }

    double getPay() {
        return pay;
    }
    String getSchool() {
        return school;
    }

    public String toString() {
        return "Staff[Person[name="+getName()+",address="+getAddress()+"], school="+school+", pay="+pay + "]";
    }
}
public class Practice {
    public static void main(String args[]) {
        Student obj1 = new Student("jeevi", "123", "abcd school",2023,500);
        Staff obj2 = new Staff("jee", "456", "ssp school",300);
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}


