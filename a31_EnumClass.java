enum a30Teams {
    BVB(100), BAYERN(), BARCA(50), REALMADRID(200);

    private int rating;

    private a30Teams() {
        System.out.println("In No Rating Constructor");
    }

    private a30Teams(int rating) {
        System.out.println("In Rating Constructor");
        this.rating = rating;
    }

    int getRating() {
        return rating;
    }

}

public class a31_EnumClass {
    public static void main(String[] args) {

        for (a30Teams teams : a30Teams.values()) {
            System.out.println(teams + " " + teams.getRating());
        }
    }
}
