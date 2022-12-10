package opp;

class Doctor{
    String name;
    int age;

    void treatPatient(){
        System.out.println("Treating Patient");
    }
} 

class FamilyDoctor extends Doctor{
    @overide
    void treatPatient() {
        System.out.println("Treating family patients");
    }

    Void giveAdvice(){
        System.out.println("Giving advice"):
    }
}
public class Inheritence {
    public static void main(String[] args) {
        FamilyDoctor obj = new FamilyDoctor();
        obj.name = "Fedora";
        System.out.println(obj.name);
        obj.treatPatient();
    }
}
