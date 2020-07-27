package models;

public class ModelTable {
    private String id;
    private String ism;
    private String familiya;
    private String tell;

    public ModelTable() {
    }

    public ModelTable(String id, String ism, String familiya,String tell) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.tell=tell;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
