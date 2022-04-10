package OOP_K14DCPM01.Baikiemtracuoiky;
import java.util.Date;
import java.text.*;
public class HangSanhSu extends HangHoa{
    private String nhaSanXuat;
    private Date ngayNhapKho;
    public HangSanhSu() 
    {
        super();
        nhaSanXuat=new String();
        ngayNhapKho = new Date();
    }
    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public String danhGia()
    {
        Date dNow = new Date();
        if(super.getSoLuongTon()>50&&super.soNgayChenhLech(dNow, ngayNhapKho)>10)
            return " , Danh gia : Ban cham ";
        return "";
    }
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
        return "Hang sanh su  - "+super.toString()+ " , Nha san xuat : "+ nhaSanXuat + " , Ngay nhap kho : "+ ft.format(ngayNhapKho)+danhGia();
    }
    public double getVAT()
    {
        return 0.1;
    }
}
