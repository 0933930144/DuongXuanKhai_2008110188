package OOP_K14DCPM01.Baikiemtracuoiky;
import java.util.Date;
import java.text.*;
public class HangThucPham extends HangHoa{
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;
    public HangThucPham() {
        super();
        ngaySanXuat=new Date();
        ngayHetHan=new Date();
    }
    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, Date ngaySanXuat, Date ngayHetHan,
            String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }
    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public Date getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    public String getNhaCungCap() {
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    public String danhGia()
    {
        Date dNow = new Date();
        if(super.getSoLuongTon()>0&&dNow.compareTo(ngayHetHan)>0)
            return " , Danh gia : Kho ban ";
        return "";
    }
    public double getVAT()
    {
        return 0.05;
    }
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
        return "Hang thuc pham  - "+super.toString()+ " , Ngay san xuat : " + ft.format(ngaySanXuat) + " , Ngay het han : "+ft.format(ngayHetHan) + " , Nha cung cap :" + nhaCungCap+danhGia();
    }
}
