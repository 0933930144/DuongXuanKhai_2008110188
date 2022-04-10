package OOP_K14DCPM01.Baikiemtracuoiky;
import java.util.Scanner;
public class main {
    public void xuLy()
    {
        int choice=0;
        Scanner tt = new Scanner(System.in);
        DanhSachHangHoa a=new DanhSachHangHoa();
        do{
            System.out.print("\n-------------Menu-------------\n1. Them 1 hang hoa\n2. Xuat danh sach hang hoa\n3. Xoa hang hoa theo ma\n4. Sap xep hang hoa giam dan theo so luong ton kho\n5. Thong ke so luong moi loai hang hoa\n0. Thoat\nHay chon....");
            choice=tt.nextInt();
            switch(choice)
            {
                case 1:
                {
                    a.nhapThongTin1HangHoaThem();
                    break;
                }
                case 2:
                {
                    System.out.print("Danh sach hang hoa :\n");
                    a.xuatToanBoDanhSach();
                    break;
                }
                case 3:
                {
                    a.xoaHangHoa();
                    break;
                }
                case 4:
                {
                    a.sapXepGiamDanTheoSoLuongTonKho();
                    System.out.print("Danh sach hang hoa giam dan theo so luong ton kho : \n");
                    a.xuatToanBoDanhSach();
                    break;
                }
                case 5:
                {
                    int ss=0,tp=0;
                    for(int i=0;i<a.getDanhSach().size();i++)
                        if(a.getDanhSach().get(i).getClass().isAssignableFrom(HangSanhSu.class))
                            ss++;
                            else
                                if(a.getDanhSach().get(i).getClass().isAssignableFrom(HangThucPham.class))
                                tp++;
                    System.out.println("So luong hang hoa sanh su la "+ss);
                    System.out.println("So luong hang hoa thuc pham la "+tp);
                    System.out.println("So luong hang hoa dien may la "+(a.getDanhSach().size()-(ss+tp)));
                    break;
                }
            }
        }while(choice!=0);   
    }
    public static void main(String[] args) {
        main m=new main();
        m.xuLy();
    }
}
