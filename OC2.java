class Employee{
    private String Ename, Enumber, Edep;
    private Float Esalary;
    
    void setEmp(String Ename, String Enumber, String Edep, Float Esalary){
    this.Ename=Ename;
    this.Enumber=Enumber;
    this.Edep=Edep;
    this.Esalary=Esalary;}
    
    void updateEsalary(float x){
    this.Esalary=Esalary+(Esalary*x/100);}
    
    String getEname(){return Ename;}
    String getEnumber(){return Enumber;}
    String getEdep(){return Edep;}
    Float getEsalary(){return Esalary;}
}

class Department{
    private String Dname, HOD;
    public Employee[] emp;
    
    Department(Employee[] emps){
    this.emp=emps;}
    
    void setDep(String Dname, String HOD){
    this.Dname=Dname;
    this.HOD=HOD;}
    
    void updateHOD(String x){
    this.HOD=x;}
    
    String getDname(){return Dname;}
    String getHOD(){return HOD;}
}

public class OC2 {
    public static void main(String[] args){
        Employee E1= new Employee();
        E1.setEmp("Rudra", "123", "CSE", 1234.56F);
        Employee E2= new Employee();
        E2.setEmp("Rud", "12", "CSE", 123.45F);
        System.out.println("Employee Number: "+E1.getEnumber() +", Name: "+E1.getEname()+", Dep: "+E1.getEdep()+", Salary before updation: "+E1.getEsalary());
        
        Employee emps[]= {E1, E2};
        Department D1= new Department(emps);
        D1.setDep("XYZ", "CSE");
        Department D2= new Department(emps);
        D2.setDep("abc", "ECE");
        
        E1.updateEsalary(5);
        D1.updateHOD("Dr. Baijnath Kaushik");
        
        System.out.println("Employee Number: "+E1.getEnumber() +", Name: "+E1.getEname()+", Dep: "+E1.getEdep()+", Salary after updation: "+E1.getEsalary());
        System.out.println("Department Name: "+D1.getDname() +", HOD: "+D1.getHOD());
    }
}