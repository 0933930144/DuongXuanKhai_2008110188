package OOP_K14DCPM01.Baikiemtracuoiky;
public class HangDienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private int congSuat;
    public HangDienMay() 
    {
        super();
        thoiGianBaoHanh=0;
        congSuat=0;
    }
    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, int congSuat) 
    {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public int getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public String danhGia()
    {
        if(super.getSoLuongTon()<3)
            return " , Danh gia : Ban duoc ";
        return "";
    }
    public double getVAT()
    {
        return 0.1;
    }
    public String toString() {
        return "Hang dien may - "+super.toString()+" , Thoi gian bao hanh : " + thoiGianBaoHanh + ", Cong suat : " + congSuat+danhGia();
    }
}
