import java.util.Scanner;

public class Employee {
    public String Hoten;
    public int Namsinh;
    public int Tuoi;
    public String Gioitinh;
    public String Phongban;
    public String Duan;
    public String Diachi;
public void nhapthongtin()
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ho ten: ");
    Hoten = scanner.nextLine();
    
    System.out.print("Nhap gioi tinh: ");
    Gioitinh = scanner.nextLine();
    
    System.out.print("Nhap nam sinh: ");
    Namsinh = scanner.nextInt();
   
    System.out.print("Nhap phong ban: ");
    Phongban = scanner.nextLine();
    
    System.out.print("Nhap du an: ");
    Duan = scanner.nextLine();
   
    System.out.print("Nhap dia chi: ");
    Diachi = scanner.nextLine();
    scanner.close();
}
public void tinhtuoi()
{
    Tuoi = 2024 - Namsinh;
}
public void inthongtin()
{
    System.out.println("Ho ten: " + Hoten);
    System.out.println("Nam sinh: " + Namsinh);
    System.out.println("Gioi tinh: " + Gioitinh);
    System.out.println("Tuoi: " + Tuoi);
    System.out.println("Phong ban: " + Phongban);
    System.out.println("Du an: " + Duan);
    System.out.println("Dia chi: " + Diachi);
}
public static void main(String[] args)
 {
    Employee ep = new Employee();
    ep.nhapthongtin();
    ep.tinhtuoi();
    ep.inthongtin();
}
}