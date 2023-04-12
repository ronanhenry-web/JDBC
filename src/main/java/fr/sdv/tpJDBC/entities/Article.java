package fr.sdv.tpJDBC.entities;

public class Article {
    private int id;
    private String ref;
    private String designation;
    private float prix;
    private int id_fou;

    public Article(int id, String ref, String designation, float prix, int id_fou) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
        this.id_fou = id_fou;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getId_fou() {
        return id_fou;
    }

    public void setId_fou(int id_fou) {
        this.id_fou = id_fou;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", id_fou=" + id_fou +
                '}';
    }
}
