public class CatHouse {
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }


    public void rollCall() {
        if (cat1.GetAge() > cat2.GetAge()) {
            cat1.introduce();
            cat2.introduce();
        }
        else if (cat2.GetAge() > cat1.GetAge()) {
            cat2.introduce();
            cat1.introduce();
        } else {
            if (cat1.getName() == cat2.getName()) {
                cat1.introduce();
                cat2.introduce();
            }
        }
    }


    public void catNoise() {
        System.out.println(cat1.speak());
        System.out.println(cat2.speak());
    }


    public String houseInfo() {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + ", Age: " + cat1.GetAge() + "\n";
        str += "Cat 2's Name: " + cat2.getName() + ", Age: " + cat2.GetAge();
        return str;
    }
}