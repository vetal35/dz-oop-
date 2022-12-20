//public class Father {
    
//}
public class Father extends Person{

    public Father(Integer id, String fName, String sName, String gender, String birthDate, Boolean status) {
        super(id, fName, sName, gender, birthDate, status);
    }
    
    public Father(Integer id, String fName, String sName, String gender, String birthDate, Boolean status,
            Integer fatherID, Integer motherID, Integer sisterID, Integer brotherID, Integer partnerID, Integer sonID,
            Integer daughterID) {
        super(id, fName, sName, gender, birthDate, status, fatherID, motherID, sisterID, brotherID, partnerID, sonID,
                daughterID);
    }

    public Father(Person person){
        this.setId(person.getId());
        this.setBirthDate(person.getBirthDate());
        this.setBrotherID(person.getBrotherID());
        this.setDaughterID(person.getDaughterID());
        this.setFatherID(person.getFatherID());
        this.setGender(person.getGender());
        this.setMotherID(person.getMotherID());
        this.setPartnerID(person.getPartnerID());
        this.setSisterID(person.getSisterID());
        this.setSonID(person.getSonID());
        this.setStatusAlive(person.getStatusAlive());
        this.setfName(person.getfName());
        this.setsName(person.getsName());
    }

    public Father() {
    }

    @Override
    public void Hello() {
        System.out.println("Привет, я папа. Меня зовут " + getfName());
    }
  
}