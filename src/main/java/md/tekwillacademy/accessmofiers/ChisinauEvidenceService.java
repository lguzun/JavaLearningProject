package md.tekwillacademy.accessmofiers;

import md.tekwillacademy.accessmofiers.peopleevidence.Person;

public class ChisinauEvidenceService {
    public static void main(String[] args) {

        Person ghitaObject = new Person ("Ghita","Josan", 1234567890,"RM", false);

        System.out.println("ghitaObject cu name: " + ghitaObject.returnName() + " si surname: " + ghitaObject.returnSurame()
         + " ID: " + ghitaObject.returnID() + ghitaObject.returnRetired() + " si residence: " + ghitaObject.returnResidence());

        Person maruseaObject = new Person("Marusea", "Chicu", 23266565, "RM", true);
        System.out.println("maruseaObject cu name: " + maruseaObject.returnName() + " si surname: " + maruseaObject.returnSurame()
                + " ID: " + maruseaObject.returnID() + maruseaObject.returnRetired() + " si residence: " + maruseaObject.returnResidence());


        Person ionObject = new Person ("Ion", "Efros",233232323);
        System.out.println("maruseaObject cu name: " + ionObject.returnName() + " si surname: " + ionObject.returnSurame()
                + " ID: " + ionObject.returnID() + ionObject.returnRetired() + " si residence: " + ionObject.returnResidence());

        System.out.println();
        System.out.println(ionObject.toString());

        System.out.println();
        System.out.println(ghitaObject.toString());

        System.out.println();
        System.out.println(maruseaObject.toString());
    }
}
