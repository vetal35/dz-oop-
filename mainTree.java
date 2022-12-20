import java.util.HashSet;
import java.util.Set;

public class mainTree {
    public static void main(String[] args) {
        Set<Person> korkinFamily = new HashSet<>();

        Person man = new Person(1, "Геннадий", "Коркин", "муж", "19.08.2001", true, 2, 3);
        Person manFather = new Person(2, "Кирилл", "Коркин", "муж", "12.10.1975", true, 7, 6);
        Person manMother = new Person(3, "Елена", "Коркина", "жен", "05.03.1978", true, 9, 8);
        Person manSister = new Person(4, "Василиса", "Коркина", "жен", "21.06.2005", true, 2, 3);
        Person manSon = new Person(5, "Аркадий", "Коркин", "муж", "19.08.2021", true, 1, 11);
        Person manGrandMotherF = new Person(6, "Анна", "Коркина", "жен", "08.02.1955", true);
        Person manGrandFatherF = new Person(7, "Василий", "Коркин", "муж", "09.02.1954", false);
        Person manGrandMotherM = new Person(8, "Татьяна", "Аникина", "жен", "23.01.1959", true);
        Person manGrandFatherM = new Person(9, "Андрей", "Аникин", "муж", "09.02.1960", false);
        Person fathersBrother = new Person(10, "Евгений", "Коркин", "муж", "14.08.1979", true);
        Person manPartner = new Person(11, "Карина", "Пилюлькина", "жен", "03.05.2002", true);

        man.setSisterID(4);
        man.setSonID(5);
        man.setPartnerID(11);

        manFather.setSonID(1);
        manFather.setBrotherID(10);

        manMother.setSonID(1);
        manGrandFatherF.setSonID(2);
        manGrandMotherF.setSonID(2);
        manGrandFatherM.setDaughterID(3);
        manGrandMotherM.setDaughterID(3);

        manPartner.setPartnerID(1);

        korkinFamily.add(man); korkinFamily.add(manFather); korkinFamily.add(manMother); korkinFamily.add(manSon);
        korkinFamily.add(manSister); korkinFamily.add(manGrandFatherF); korkinFamily.add(manGrandFatherM); 
        korkinFamily.add(manGrandMotherF); korkinFamily.add(manGrandMotherM); korkinFamily.add(fathersBrother);
        korkinFamily.add(manPartner);

        Set<Person> fatherBranch = new HashSet<>();
        Set<Person> motherBranch = new HashSet<>();
        Set<Person> korkinsTree = getTree(korkinFamily, 1);
        for(Person obj : korkinsTree){
                obj.Hello();
                System.out.println(obj);
                System.out.println();
                if(obj instanceof Father) fatherBranch = getBranch(korkinFamily, obj);
                if(obj instanceof Mother) motherBranch = getBranch(korkinFamily, obj);
        }
        System.out.println("-----------");
        System.out.println("Родственники с папиной стороны: ");
        printSet(fatherBranch);
        System.out.println("-----------");
        System.out.println("Родственники с маминой стороны: ");
        printSet(motherBranch);  
    }

    public static Set<Person> getTree(Set<Person> family, Integer first){
        Set<Person> result = new HashSet<>();

        Person whoseTree = new Person();
        for(Person obj : family){
            if(obj.getId() == first) {
                whoseTree = obj;
                result.add(obj);  
            }
        }

        for(Person o : family){
            Integer id = o.getId();
            if(id == whoseTree.getMotherID()){
                Person mother = new Mother(o);
                result.add(mother);
            }
            else if(id == whoseTree.getFatherID()) {
                Person father = new Father(o);
                result.add(father);
            }
            else if(id == whoseTree.getSisterID()){
                Person sister = new Sister(o);
                result.add(sister);
            }
            else if(id == whoseTree.getBrotherID()){
                Person brother = new Brother(o);
                result.add(brother);
            }
            else if(id == whoseTree.getSonID()){
                Person son = new Son(o);
                result.add(son);
            }
            else if(id == whoseTree.getDaughterID()){
                Person daughter = new Daughter(o);
                result.add(daughter);
            }
            else if(id == whoseTree.getPartnerID()){
                Person partner = new Partner(o);
                result.add(partner);
            }
        }
       return result;
    }

    public static Set<Person> getBranch(Set<Person> family, Person parent){
        Set<Person> result = new HashSet<>();
        result.add(parent);
        for(Person p : family){
            if(p.getId() == parent.getMotherID()) {
                result.add(p);
                result.addAll(getBranch(family, p));
            }
            else if(p.getId() == parent.getFatherID()) {
                result.add(p);
                result.addAll(getBranch(family, p));
            }
            else if(p.getId() == parent.getBrotherID()) {
                result.add(p);
                result.addAll(getBranch(family, p));
            }
            else if(p.getId() == parent.getSisterID()) {
                result.add(p);
                result.addAll(getBranch(family, p));
            }
        }
        
        return result;
    }

    public static void printSet(Set<Person> set) {
        for(Person p : set){
            System.out.println(p);
        }
    }
}