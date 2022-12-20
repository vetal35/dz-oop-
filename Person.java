//public class Person {
    
//}
public class Person extends Man {
    private Integer fatherID;
    private Integer motherID;
    private Integer sisterID;
    private Integer brotherID;
    private Integer partnerID;
    private Integer sonID;
    private Integer daughterID;
    
    public Person(Integer id, String fName, String sName, String gender, String birthDate, Boolean status,
            Integer fatherID, Integer motherID, Integer sisterID, Integer brotherID, Integer partnerID, Integer sonID,
            Integer daughterID) {
        super(id, fName, sName, gender, birthDate, status);
        this.fatherID = fatherID;
        this.motherID = motherID;
        this.sisterID = sisterID;
        this.brotherID = brotherID;
        this.partnerID = partnerID;
        this.sonID = sonID;
        this.daughterID = daughterID;
    }
    
    public Person(Integer id, String fName, String sName, String gender, String birthDate, Boolean status, Integer fatherID, Integer motherID){
        this(id, fName, sName, gender, birthDate, status, fatherID, motherID, null, null, null, null, null);
    }

    public Person(Integer id, String fName, String sName, String gender, String birthDate, Boolean status){
        this(id, fName, sName, gender, birthDate, status, null, null, null, null, null, null, null);
    }

    public Person(){
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public Integer getFatherID() {
        return fatherID;
    }

    public void setFatherID(Integer fatherID) {
        this.fatherID = fatherID;
    }

    public Integer getMotherID() {
        return motherID;
    }

    public void setMotherID(Integer motherID) {
        this.motherID = motherID;
    }

    public Integer getSisterID() {
        return sisterID;
    }

    public void setSisterID(Integer sisterID) {
        this.sisterID = sisterID;
    }

    public Integer getBrotherID() {
        return brotherID;
    }

    public void setBrotherID(Integer brotherID) {
        this.brotherID = brotherID;
    }

    public Integer getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Integer partnerID) {
        this.partnerID = partnerID;
    }

    public Integer getSonID() {
        return sonID;
    }

    public void setSonID(Integer sonID) {
        this.sonID = sonID;
    }

    public Integer getDaughterID() {
        return daughterID;
    }

    public void setDaughterID(Integer daughterID) {
        this.daughterID = daughterID;
    }

    @Override
    public void Hello() {
        System.out.println("Привет, я " + getfName() + ". Это моя семья.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

