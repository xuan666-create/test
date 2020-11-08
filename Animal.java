interface BarkAbility {




    void bark();

}
class Animal {


    int age;
    String name;

    Animal(int age) {
        this.age = age;
    }


        Animal(String name){
            this.name = name;
        }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}



