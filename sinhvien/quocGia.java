
package com.len.quanlysinhvien.sinhvien;

public class quocGia {
    private String MaSV_id,TenSV_name;

    public quocGia(String MaSV_id, String TenSV_name) {
        this.MaSV_id = MaSV_id;
        this.TenSV_name = TenSV_name;
    }

    public quocGia() {
    }

    @Override
    public String toString() {
        return TenSV_name + " - " + MaSV_id;
    }

    public String getMaSV_id() {
        return MaSV_id;
    }

    public void setMaSV_id(String MaSV_id) {
        this.MaSV_id = MaSV_id;
    }

    public String getTenSV_name() {
        return TenSV_name;
    }

    public void setTenSV_name(String TenSV_name) {
        this.TenSV_name = TenSV_name;
    }
    
}