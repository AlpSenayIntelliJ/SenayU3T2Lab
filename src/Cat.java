public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }


    public int GetAge() {
        return age;
    }



    public String speak() {
        int randnum = (int) (Math.random()*3+1);
        if (randnum == 1) {
            return "prrrup";
        }
        else if (randnum == 2) {
            return "mrow";
        } else {
            return "purrrrrr";
        }
    }

    public void introduce() {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}