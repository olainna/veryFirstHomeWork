public class Main {
    public static void main(String[] args) {
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Oбщий вес боксеров " + totalWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг");
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами боксеров " + weightDifference + "кг");

        var totalWorkingHours = 640;
        var oneEmployeeWorkingHours = 8;
        var totalEmployeesAmount = totalWorkingHours / oneEmployeeWorkingHours;
        System.out.println("Всего работников в компании " + totalEmployeesAmount);
        totalEmployeesAmount = totalEmployeesAmount + 94;
        totalWorkingHours = totalEmployeesAmount * 8;
        System.out.println("Если в компании работает " + totalEmployeesAmount + " человек(a), то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками.");
    }
}