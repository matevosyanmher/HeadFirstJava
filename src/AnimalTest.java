public class AnimalTest extends Dog {

    public AnimalTest(String name) {
        super(name);

    }


    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest("shun");
        animalTest.roam();
        animalTest.play();
        String name = animalTest.getName();
        System.out.println(name);
    }
}
