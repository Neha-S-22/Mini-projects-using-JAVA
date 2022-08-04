import java.util.Scanner;
class Staff
{
private int StaffId;
private String Name;
private String Phone;
private long Salary;
public Staff(int staffId,String name,String phone,long salary)
{
StaffId = staffId;
Name = name;
Phone = phone;
Salary = salary;
}
public void Display()
{
System.out.print("\t"+StaffId+"\t"+Name+"\t"+Phone+"\t"+Salary);
}
}
class Teaching extends Staff
{
private String Domain;
private int Publications;
public Teaching(int staffId, String name, String phone, long salary, String domain, int publications)
{
	super(staffId, name, phone, salary);
	Domain = domain;
	Publications = publications;
}
public void Display()
{
super.Display();
System.out.print("\t"+Domain+"\t"+Publications+"\t\t"+"--"+"\t"+"--");
}
}
class Technical extends Staff
{private String Skills;
public Technical(int staffId, String name, String phone, long salary, String skills)
{
super(staffId, name, phone, salary);
Skills = skills;
}
public void Display()
{
super.Display();
System.out.print("\t"+"--"+"\t"+"--"+"\t\t"+Skills+"\t"+"--");
}
}
class Contract extends Staff
{
private int Period;
public Contract(int staffId, String name, String phone, long salary, int period)
{
super(staffId, name, phone, salary);
this.Period = period;
}
public void Display()
{
super.Display();
System.out.print("\t"+"--"+"\t"+"--"+"\t\t"+"--"+"\t"+Period);
}
}
public class Inheritance
{
public static void main(String[] args)
{
int StaffId;
String Name,Phone;
long Salary;
String Domain;
int Publications;
String Skills;
int Period;
Scanner sc=new Scanner(System.in);
Staff staff[]=new Staff[50];
System.out.println("Enter number of Teaching Staff : ");
int n = sc.nextInt();
for(int i=1;i<=n;i++){
System.out.println("Enter " + i + " Teaching Staff details : StaffID, Name, Phone, Salary, Domain, Publication");
StaffId = sc.nextInt();
Name = sc.next();
Phone = sc.next();
Salary = sc.nextLong();
Domain = sc.next();
Publications = sc.nextInt();
staff[i]=new Teaching(StaffId, Name, Phone, Salary, Domain,
 Publications);
}
System.out.println("Enter number of Technical Staff : ");
int m = sc.nextInt();
for(int i=n+1;i<=m+n;i++)
{
System.out.println("Enter " + i + " Technical Staff details : Staff ID, Name, Phone, Salary, Skills");
StaffId = sc.nextInt();
Name = sc.next();
Phone = sc.next();
Salary = sc.nextLong();
Skills = sc.next();
staff[i]=new Technical(StaffId,Name,Phone,Salary,Skills);
}
System.out.println("Enter number of Contract Staff : ");
int p = sc.nextInt();
for(int i=n+m+1;i<=m+n+p;i++)
{
System.out.println("Enter " + i + " Contract Staff details : Staff ID, Name, Phone, Salary, Period");
StaffId = sc.nextInt();
Name = sc.next();
Phone = sc.next();
Salary = sc.nextLong();
Period = sc.nextInt();
staff[i]=new Contract(StaffId,Name,Phone,Salary,Period);
}
System.out.println("Staff ID \tName \tPhone \tSalary \tDomain \tPublication \tSkills \tPeriod");
for(int i=1;i<=n+m+p;i++)
{
staff[i].Display();
System.out.println();}}}


