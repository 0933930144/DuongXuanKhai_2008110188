package OOP_K14DCPM01.Baikiemtracuoiky;
import java.util.Date;
public abstract class HangHoa 
{
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private double donGia;
    public HangHoa() {
        maHang=new String();
        tenHang=new String();
        soLuongTon=0;
        donGia=0;
    }
    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }
    public String getMaHang() {
        return maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public abstract double getVAT();
    public String toString() {
        return "Ma hang : "+maHang+" , Ten hang : "+tenHang+" , So luong ton : "+soLuongTon+" , Don gia : "+donGia;
    }
    public long soNgayChenhLech(Date a, Date b) 
    {
        long t =a.getTime()-b.getTime();
        long x=(1000*60*60*24);
        return t/x;
    }
}
