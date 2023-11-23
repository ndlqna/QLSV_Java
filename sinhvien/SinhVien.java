package com.len.quanlysinhvien.sinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable{
    private int MaSV_id;
    private String TenSV_name;
    private String DiaChiSV_address;
    private String SDT_tell;
    private boolean GioiTinh_gender;
    private  String QuocTich_nationnalty;

    public SinhVien() {
    }
    public SinhVien(int MaSV_id, String TenSV_name, String DiaChiSV_address, String SDT_tell, boolean GioiTinh_gender, String QuocTich_nationnalty) {
        this.MaSV_id = MaSV_id;
        this.TenSV_name = TenSV_name;
        this.DiaChiSV_address = DiaChiSV_address;
        this.SDT_tell = SDT_tell;
        this.GioiTinh_gender = GioiTinh_gender;
        this.QuocTich_nationnalty = QuocTich_nationnalty;
    }

    public int getMaSV_id() {
        return MaSV_id;
    }

    public void setMaSV_id(int MaSV_id) {
        this.MaSV_id = MaSV_id;
    }

    public String getTenSV_name() {
        return TenSV_name;
    }

    public void setTenSV_name(String TenSV_name) {
        this.TenSV_name = TenSV_name;
    }

    public String getDiaChiSV_address() {
        return DiaChiSV_address;
    }

    public void setDiaChiSV_address(String DiaChiSV_address) {
        this.DiaChiSV_address = DiaChiSV_address;
    }

    public String getSDT_tell() {
        return SDT_tell;
    }

    public void setSDT_tell(String SDT_tell) {
        this.SDT_tell = SDT_tell;
    }

    public boolean isGioiTinh_gender() {
        return GioiTinh_gender;
    }

    public void setGioiTinh_gender(boolean GioiTinh_gender) {
        this.GioiTinh_gender = GioiTinh_gender;
    }

    public String getQuocTich_nationnalty() {
        return QuocTich_nationnalty;
    }

    public void setQuocTich_nationnalty(String QuocTich_nationnalty) {
        this.QuocTich_nationnalty = QuocTich_nationnalty;
    }
    
    
}

