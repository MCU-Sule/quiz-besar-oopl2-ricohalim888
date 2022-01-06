package com.rico.entity;

/**
 * Rico Halim 1972014
 */

import javax.persistence.*;
import java.util.Objects;

@entity
@Table(name = "items", schema = "modelKuis2PBO2", catalog = "")
public class Buku {
    private int id;
    private String judul;
    private String penerbit;
    private String pengarang;
    private String tahunTerbit;
    private String jenisBuku;

    @id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @penerbit
    @Column(name = "penerbit", nullable = false, length = 50)
    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    @pengarang
    @Column(name = "pengarang", nullable = false, precision = 50)
    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    @tahunTerbit
    @Column(name = "tahun terbit", nullable = false, length = 4)
    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    @jenisbuku
    @Column(name = "jenis buku", nullable = true, length = 50)
    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peminjaman that = (Peminjaman) o;
        return id == that.id && Double.compare(that.price, price) == 0 && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, description, photo);
    }

    @ManyToOne
    @JoinColumn(name = "Category_id", referencedColumnName = "id", nullable = false)
    public Category getItemCategory() {
        return ItemCategory;
    }

    public void setItemCategory(Category itemCategory) {
        ItemCategory = itemCategory;
    }

}