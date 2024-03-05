import java.util.Scanner;
public class hinhtron {

    public float bankinh;
    public float chuvi;
    public float dientich;
    public final float pi = 3.14f;

public void nhapbankinh() {
     System.out.println("nhapbankinh");
     Scanner scanner = new Scanner(System.in);
     bankinh = scanner.nextFloat();
     scanner.close();


}
public void tinhdientich() {
    dientich = pi * bankinh * bankinh;

}
public void tinhchuvi(){
    chuvi = 2 * pi * bankinh;
}
 public void inChuvi(){
    System.out.println("Chu vi hinh tron" + chuvi );

 }
 public void indientich(){
    System.out.println("Dien tich hinh tron"+ dientich );
 }
 public static void main(String[] args) {
    hinhtron ht = new hinhtron();
    ht.nhapbankinh();
    ht.tinhchuvi();
    ht.inChuvi();
    ht.tinhdientich();
    ht.indientich();
 }
}

    
    

