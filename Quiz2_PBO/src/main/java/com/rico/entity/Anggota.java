package com.rico.entity;

/**
 * Rico Halim 1972014
 */

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@entity
@Table(name = "anggota", schema = "modelKuis2PBO2", catalog = "")
public class Anggota {
    private int id;
    private String nama;
    private String alamat;
    //VARCHAR 14
    private String notelpon;
    private Date tglLahir;
    private Date tglMasuk;

    @id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @nama
    @Column(name = "nama", nullable = false, length = 50)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @alamat
    @Column(name = "alamat", nullable = false, precision = 50)
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @notelpon
    @Column(name = "nomor telepon", nullable = false, length = 14)
    public String getNotelpon() {
        return notelpon;
    }

    public void setNotelpon(String notelpon) {
        this.notelpon = notelpon;
    }

    @tglLahir
    @Column(name = "tanggal lahir", nullable = true)
    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String jenisBuku) {
        this.tglLahir = tglLahir;
    }
    @tglMasuk
    @Column(name = "tanggal masuk", nullable = true)
    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

}