//public class Mother {
    
//}
public class Mother extends Person {
   
    public Mother(Integer id, String fName, String sName, String gender, String birthDate, Boolean status,
            Integer fatherID, Integer motherID, Integer systerID, Integer brotherID, Integer partnerID, Integer sonID,
            Integer daughterID) {
        super(id, fName, sName, gender, birthDate, status, fatherID, motherID, systerID, brotherID, partnerID, sonID,
                daughterID);
    }
    
    public Mother(Person person){
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

    public Mother() {
    }

    @Override
    public void Hello() {
        System.out.println("Привет, я мама. Меня зовут " + getfName());
    }
}
