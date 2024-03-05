import java.util.Scanner;
public class student {
    public String hoTen;
    public int namSinh;
    public int maSV;
    public int tuoi;
    
    public void NhapHoTen (){
        Scanner sc = new Scanner (System.in);
        System.out.println("  nhap ho va ten: ");
        hoTen = sc.nextLine();
        
    }
    
    public void NhapNamSinh(){
        Scanner sc = new Scanner (System.in);
        System.out.println("  nhap nam sinh: ");
        namSinh = sc.nextInt();
        
    }

    public void NhapMSV() {
        Scanner sc = new Scanner (System.in);
        System.out.println(" nhap ma sinh vien: ");
        maSV = sc.nextInt();
        
    }
    public void inthongtin(){
        System.out.println("Ho Ten " + hoTen );
        System.out.println("Nam sinh " + namSinh);
        System.out.println("MSV" + maSV);

    }

    public void TinhTuoi() {

        tuoi = 2024 - namSinh;
       
    }
    public static void main(String[] args ){
        student st = new student();
        st.NhapHoTen();
        st.NhapMSV();
        st.NhapNamSinh();
        st.TinhTuoi();
    }
}