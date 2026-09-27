package grind.l1.Model;

public class User {
    private String name;
    private String email;
    private int id;
    private String branch;
    private String semester;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getBranch() {
        return branch;
    }

    public String getSemester() {
        return semester;
    }


}
