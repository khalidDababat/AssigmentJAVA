
package assigmentjava;


public class Student  extends User{
   
    private int Level; 
    private String College ; 
    private String University ; 

    public Student(int Id, String Name, String Gender, int Age, String Address, String Email, String Password, int Phone,int Level ,String College,String University) {
        super(Id, Name, Gender, Age, Address, Email, Password, Phone);
        this.College =College; 
        this.Level =Level; 
        this.University = University; 
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public void setCollege(String College) {
        this.College = College;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public int getLevel() {
        return Level;
    }

    public String getCollege() {
        return College;
    }

    public String getUniversity() {
        return University;
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
                + ", level= " + Level
                + ", college= " + College
                + ", university= " + University
                + "\n");


    }
    
    
    
    
    
    
    
    
    
}
