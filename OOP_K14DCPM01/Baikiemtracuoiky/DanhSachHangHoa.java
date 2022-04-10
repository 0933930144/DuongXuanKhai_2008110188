package OOP_K14DCPM01.Baikiemtracuoiky;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class DanhSachHangHoa {
    private ArrayList<HangHoa> a;
    public DanhSachHangHoa()
    {
        a=new ArrayList<HangHoa>();
        a.add(new HangSanhSu("MH01", "Chen", 30, 100000, "Hai Au",new Date("10/02/2010")));
        a.add(new HangSanhSu("MH02", "Dia", 30, 50000, "Hai Au",new Date("11/03/2022")));
        a.add(new HangSanhSu("MH03", "Binh hoa", 100, 100000, "Bat Trang",new Date("22/06/2021")));
        a.add(new HangSanhSu("MH04", "Ly", 50, 15000, "Bat Trang",new Date("27/08/2021")));
        a.add(new HangDienMay("MH05", "TiVi", 12, 14000000, 24, 500));
        a.add(new HangDienMay("MH06", "Tu lanh", 10, 8000000, 36, 600));
        a.add(new HangDienMay("MH07", "May say", 50, 300000, 12, 1500));
        a.add(new HangDienMay("MH08", "May giat", 20, 7500000, 24, 800));
        a.add(new HangThucPham("MH09", "Banh chocolate", 100, 20000,new Date("20/08/2021") , new Date("20/08/2022"), "Gia Binh"));
        a.add(new HangThucPham("MH10", "Banh Nabati", 200, 10000,new Date("15/12/2021") , new Date("12/6/2022"), "Thien Phu"));
    }
    public DanhSachHangHoa(ArrayList<HangHoa> b) 
    {
        this.a=b;
    }
    public ArrayList<HangHoa> getDanhSach() {
        return a;
    }
    public void nhapThongTin1HangHoaThem()
    {
        Scanner tt = new Scanner(System.in);
        int i=0;
        String ma,tenHang;
        int soLuongTon;
        double donGia;
        do
        {
            System.out.print("Nhap ma hang : ");
            ma=tt.nextLine();
            for(i=0;i<a.size();i++)
                if(a.get(i).getMaHang().compareTo(ma)==0)
                    break;
            if(i<a.size())
                System.out.println("Ma hang da ton tai, xin moi nhap lai !");
        }while(i<a.size());
        System.out.print("Nhap ten hang : ");
        tenHang=tt.nextLine();
        System.out.print("Nhap so luong ton kho : ");
        soLuongTon=tt.nextInt();
        System.out.print("Nhap don gia : ");
        donGia=tt.nextDouble();
        int choice=0;
        do{
            System.out.print("Chon loai hang hoa dang nhap thong tin:\n1. Hang dien may\n2. Hang sanh su\n3. Hang thuc pham\nHay chon...");
            choice=tt.nextInt();
            if(choice>3||choice<1)
                System.out.println("Chon sai,  hay chon lai !");
        }while(choice<1||choice>3);
        switch(choice)
        {
            case 1:
            {
                int thoiGianBaoHanh,congSuat;
                System.out.print("Nhap thoi gian bao hanh (so thang) : ");
                thoiGianBaoHanh=tt.nextInt();
                System.out.print("Nhap cong suat : ");
                congSuat=tt.nextInt();
                a.add(new HangDienMay(ma, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat));
                break;
            }
            case 2:
            {
                String nhaSanXuat;
                String ngayNhapKho;
                tt.nextLine();
                System.out.print("Nhap ten nha san xuat : ");
                nhaSanXuat=tt.nextLine();
                System.out.print("Nhap ngay nhap kho (dd/MM/yyyy) : ");
                ngayNhapKho=tt.nextLine();
                a.add(new HangSanhSu(ma, tenHang, soLuongTon, donGia, nhaSanXuat, new Date(ngayNhapKho)));
                break;
            }
            case 3:
            {
                String  ngaySanXuat1,ngayHetHan1;
                tt.nextLine();
                System.out.print("Nhap ngay san xuat (dd/MM/yyyy) : ");
                Date ngaySanXuat,ngayHetHan;
                ngaySanXuat1=tt.nextLine();
                do
                {
                    System.out.print("Nhap ngay het han (dd/MM/yyyy) : ");
                    ngayHetHan1=tt.nextLine();
                    ngaySanXuat=new Date(ngaySanXuat1);
                    ngayHetHan=new Date(ngayHetHan1);
                    if(ngaySanXuat.getTime()-ngayHetHan.getTime()>=0)
                        System.out.println("Ngay het han phai lon hon ngay san xuat, hay nhap lai ! ");
                }while(ngaySanXuat.getTime()-ngayHetHan.getTime()<=0);
                String nhaCungCap;
                System.out.print("Nhap ten nha cung cap : ");
                nhaCungCap=tt.nextLine();
                a.add(new HangThucPham(ma, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap));
                break;
            }
        }
        System.out.println("Nhap thong tin thanh cong ");
    }
    public void xoaHangHoa()
    {
        String ma,tenHang;
        Scanner tt = new Scanner(System.in);
        int i=0;
        System.out.print("Nhap ma hang : ");
        ma=tt.nextLine();
        for(i=0;i<a.size();i++)
                if(a.get(i).getMaHang().compareTo(ma)==0)
                    break;
        if(i<a.size())
        {
            a.remove(i);
            System.out.println("Xoa thanh cong");
        }
            else
                System.out.println("Ma hang khong ton tai !");
    }
    public void sapXepGiamDanTheoSoLuongTonKho()
    {
        for(int i=0; i<a.size()-1;i++)
            for(int j=0; j<a.size();j++)
                if(a.get(i).getSoLuongTon()<a.get(j).getSoLuongTon())
                {
                    HangHoa t=a.get(i);
                    a.set(i, a.get(j));
                    a.set(j,t);
                }
    }
    public void xuatToanBoDanhSach()
    {
        for(int i=0; i<a.size();i++)
            System.out.println((i+1)+" - "+a.get(i).toString()+" , VAT : "+(a.get(i).getVAT()*100)+"%");
    }
}
