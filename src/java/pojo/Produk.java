package pojo;
// Generated Oct 12, 2021 7:53:16 PM by Hibernate Tools 4.3.1

import java.util.List;
import javax.faces.bean.ManagedBean;
import DAO.DAOProduk;
import java.io.File;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;




/**
 * Produk generated by hbm2java
 */
@ManagedBean
public class Produk  implements java.io.Serializable {


     private Integer idProduk;
     private String thumbnail;
     private String namaProduk;
     private int stokProduk;
     private String ukuranProduk;
     private String kategori;
     private String hargaProduk;
     private String deskripsiProduk;
     private List<Produk> produkList;
     
     public List<Produk> getAllRecords(){
         DAOProduk pdk = new DAOProduk();
         List<Produk> iPdk = pdk.retrveProduk();
         
         return iPdk;
     }
     
     public String getById(){
         String id_produk = idProduk.toString();
         DAOProduk pdk = new DAOProduk();
         List<Produk> lPdk = pdk.getbyID(id_produk);
         
         thumbnail = lPdk.get(0).thumbnail;
         namaProduk = lPdk.get(0).namaProduk;
         stokProduk = lPdk.get(0).stokProduk;
         ukuranProduk = lPdk.get(0).ukuranProduk;
         kategori = lPdk.get(0).kategori;
         hargaProduk = lPdk.get(0).hargaProduk;
         deskripsiProduk = lPdk.get(0).deskripsiProduk;
         
         return "edit_produk";
     }
     
     public String getProduk(){
         String id_produk = idProduk.toString();
         DAOProduk pdk = new DAOProduk();
         List<Produk> lPdk = pdk.getbyID(id_produk);
         
         thumbnail = lPdk.get(0).thumbnail;
         namaProduk = lPdk.get(0).namaProduk;
         stokProduk = lPdk.get(0).stokProduk;
         ukuranProduk = lPdk.get(0).ukuranProduk;
         kategori = lPdk.get(0).kategori;
         hargaProduk = lPdk.get(0).hargaProduk;
         deskripsiProduk = lPdk.get(0).deskripsiProduk;
         
         return "detail";
     }
     
    public void edit(){
         DAOProduk pdk = new DAOProduk();
         pdk.editProduk(this);
         String stok_produk = String.valueOf(stokProduk);
         
         namaProduk = "";
         stok_produk = "";
         ukuranProduk = "";
         kategori = "";
         hargaProduk = "";
         deskripsiProduk = "";
         FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,"Berhasil Update!",null);
     }

    public  void delete(){
         DAOProduk pdk = new DAOProduk();
         pdk.deleteProduk(idProduk);
         String stok_produk = String.valueOf(stokProduk);
         String thumb = String.valueOf(thumbnail);
         
         namaProduk = "";
         thumb = "";
         stok_produk = "";
         ukuranProduk = "";
         kategori = "";
         hargaProduk = "";
         deskripsiProduk = "";
    }
    
    public String save_produk (){
        DAOProduk add = new DAOProduk();
        add.add_produk(this);
        return "edit_produk";
    }

    public Produk() {
    }

	
    public Produk(String namaProduk, int stokProduk, String ukuranProduk, String kategori, String hargaProduk, String deskripsiProduk) {
        this.namaProduk = namaProduk;
        this.stokProduk = stokProduk;
        this.ukuranProduk = ukuranProduk;
        this.kategori = kategori;
        this.hargaProduk = hargaProduk;
        this.deskripsiProduk = deskripsiProduk;
    }
    public Produk(String thumbnail, String namaProduk, int stokProduk, String ukuranProduk, String kategori, String hargaProduk, String deskripsiProduk) {
       this.thumbnail = thumbnail;
       this.namaProduk = namaProduk;
       this.stokProduk = stokProduk;
       this.ukuranProduk = ukuranProduk;
       this.kategori = kategori;
       this.hargaProduk = hargaProduk;
       this.deskripsiProduk = deskripsiProduk;
    }
   
    public Integer getIdProduk() {
        return this.idProduk;
    }
    
    public void setIdProduk(Integer idProduk) {
        this.idProduk = idProduk;
    }
    public String getThumbnail() {
        return this.thumbnail  == null ? "baju1" : this.thumbnail;
    }
    
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getNamaProduk() {
        return this.namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public int getStokProduk() {
        return this.stokProduk;
    }
    
    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }
    public String getUkuranProduk() {
        return this.ukuranProduk;
    }
    
    public void setUkuranProduk(String ukuranProduk) {
        this.ukuranProduk = ukuranProduk;
    }
    public String getKategori() {
        return this.kategori;
    }
    
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    public String getHargaProduk() {
        return this.hargaProduk;
    }
    
    public void setHargaProduk(String hargaProduk) {
        this.hargaProduk = hargaProduk;
    }
    public String getDeskripsiProduk() {
        return this.deskripsiProduk;
    }
    
    public void setDeskripsiProduk(String deskripsiProduk) {
        this.deskripsiProduk = deskripsiProduk;
    }

    public String getDefaultPhoto(String value) {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext(); 
        String webContentRoot = ec.getRealPath("/");
        File file = new File(webContentRoot.concat("images/"+value));
        
        return file.exists() && !file.isDirectory() ? value : "baju1.png";
    }

    public List<Produk> getProdukList() {
        return produkList == null ? this.getAllRecords() : produkList;
    }

    public void setProdukList(List<Produk> produkList) {
        this.produkList = produkList;
    }
    
}


