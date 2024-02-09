
package assigmentjava;


public abstract class User {
    
    private int Id ,Age ,Phone ; 
    private String Name ,Gender ,Address,Email,Password;
   
        
    
    

    public User(int Id, String Name, String Gender, int Age, String Address, String Email, String Password, int Phone) {
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.Address = Address;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public int getPhone() {
        return Phone;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + ", Address=" + Address + ", Email=" + Email + ", Password=" + Password + ", Phone=" + Phone + '}';
    }
    
    public abstract String printInfo(); 
    
}
