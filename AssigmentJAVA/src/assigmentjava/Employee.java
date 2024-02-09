
package assigmentjava;


public class Employee extends User {
    
    
    
    private String Jop ; 
    private String Company ; 
    private double Salary ; 

    public Employee(int Id, String Name, String Gender, int Age, String Address, String Email, String Password, int Phone,String Jop ,String Company ,double salary) {
        super(Id, Name, Gender, Age, Address, Email, Password, Phone); 
        this.Company = Company; 
        this.Jop =Jop;
        this.Salary =Salary; 
        
        
    }

    public void setJop(String Jop) {
        this.Jop = Jop;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getJop() {
        return Jop;
    }

    public String getCompany() {
        return Company;
    }

    public double getSalary() {
        return Salary;
    }

    
    
    
    
    @Override
    public String printInfo() {
 return("ID = " + this.getId()
                + ", age= " + this.getAge() 
                + ", phone= " + this.getPhone()
                + ", name= " + this.getName() 
                + ", gender= " + this.getGender()
                + ", address= " + this.getAddress()
                + ", email= " + this.getEmail()
                + ", password= " + this.getPassword()
                + ", Company= " + Company
                + ", Jop= " + Jop
                + ", Salary= " + Salary
                + "\n"); 
    }
    
    
    
    
    
    
    
    
    
}
