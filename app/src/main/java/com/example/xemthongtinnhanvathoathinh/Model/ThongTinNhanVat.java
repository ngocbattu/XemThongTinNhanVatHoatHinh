package com.example.xemthongtinnhanvathoathinh.Model;

public class ThongTinNhanVat {
    private int id;
    private int imageAnh;
    private String ten;
    private int tuoi;
    private String moTa;

    public ThongTinNhanVat() {
    }

    public ThongTinNhanVat(int id, int imageAnh, String ten, int tuoi, String moTa) {
        this.id = id;
        this.imageAnh = imageAnh;
        this.ten = ten;
        this.tuoi = tuoi;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageAnh() {
        return imageAnh;
    }

    public void setImageAnh(int imageAnh) {
        this.imageAnh = imageAnh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
