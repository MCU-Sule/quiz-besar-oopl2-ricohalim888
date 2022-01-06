package com.rico.entity;

/**
 * Rico Halim 1972014
 */

import javax.persistence.*;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

@entity
@Table(name = "peminjaman", schema = "modelKuis2PBO2", catalog = "")
public class Peminjaman {
    private int id;
    private int Buku_id;
    private int Anggota_id;
    private Date tglPinjam;
    private Date tglPengembalian;

    @id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Buku_id
    @Column(name = "Buku id", nullable = false)
    public int getBuku_id() {
        return Buku_id;
    }

    public void setBuku_id(int Buku_id) {
        this.Buku_id = Buku_id;
    }

    @Anggota_id
    @Column(name = "Anggota id", nullable = false)
    public int getAnggota_id() {
        return Anggota_id;
    }

    public void setAnggota_id(int Anggota_id) {
        this.Anggota_id = Anggota_id;
    }

    @tglPinjam
    @Column(name = "tgl Pinjam", nullable = false)
    public int getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(int tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    @tglPengembalian
    @Column(name = "tgl Pengembalian", nullable = false)
    public int getTglPengembalian() {
        return tglPengembalian;
    }

    public void setTglPengembalian(int tglPengembalian) {
        this.tglPengembalian = tglPengembalian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peminjaman that = (Peminjaman) o;
        return id == that.id && Double.compare(that.Buku_id, Buku_id) == 0 && Objects.equals(Anggota_id,
                that.Anggota_id) && Objects.equals(id, that.id) && Objects.equals(tglPengembalian, that.tglPengembalian)
                && Objects.equals(tglPinjam, that.tglPinjam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Buku_id, Anggota_id, tglPinjam, tglPengembalian);
    }

}