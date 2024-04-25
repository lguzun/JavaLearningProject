package md.tekwillacademy.accessmofiers.peopleevidence;

public class Person {

    private String name;
    private String surname;
    private final int ID;
    protected String residence;
    public boolean isRetired;

    //Constructior fara parametri

    //Constructior cu doar 3 parametri
    public Person(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        ID = id;
        System.out.println();
        System.out.println("Un obiect de tip Person cu 3 parametri a fost creat");
    }

    //Constructior cu toti parametrii
    public Person(String name, String surname, int id, String residence, boolean isRetired) {
        this.name = name;
        this.surname = surname;
        ID = id;
        this.residence = residence;
        this.isRetired = isRetired;
        System.out.println();
        System.out.println("Un obiect de tip Person cu TOTI parametrii a fost creat");
    }

    public String returnName() {
        return this.name;
    }

    public String returnSurame() {
        return this.surname;
    }

    public long returnID() {
        return this.ID;
    }

    public String returnResidence() {
        return this.residence;
    }

    public String returnRetired() {
        boolean isRetired = false; // Declare and initialize the variable
        if (!isRetired) { // Check if isRetired is false
            return "notretired"; // Return the string if not retired
        } else {
            return "retired"; // Return the string if retired
        }
    }
        public String toString() {
            return ("Datele din metoda ToString pt Person: " + this.name + " " + this.surname + " cu ID-ul " + ID + " residence " + residence +
                    " retired " + isRetired);

        }
    }


