package HW_2_OOP_JAVA;

public class Test1 implements Search, Search2 {
    String familyName;
    int age;

    @Override
    public String getFamilyName() {
        if (familyName == familyName) return "Родственник";
        else return " НЕ Родственник";
    }

    @Override
    public void findRelative() {
        System.out.println(familyName);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void findRelative2() {
        System.out.println(familyName);
    }
}
