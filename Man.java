//public class Man {
    
//}

public class Man {
    private Integer id;
    private String fName;
    private String sName;
    private String gender;
    private String birthDate;;
    private Boolean statusAlive;

    public Man(Integer id, String fName, String sName, String gender, String birthDate, Boolean status) {
        this.id = id;
        this.fName = fName;
        this.sName = sName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.statusAlive = status;
    }
    
    @Override
    public String toString() {
        return "id = " + id + ", Имя = " + fName + ", Фамилия = " + sName + ", Пол = " + gender + ", Дата рождения = "
                + birthDate + ", Жив = " + statusAlive;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getStatusAlive() {
        return statusAlive;
    }

    public void setStatusAlive(Boolean status) {
        this.statusAlive = status;
    }

    public void Hello(){
        System.out.println("Привет, я человек!");
    }
}