public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend + "\n");

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");

        // Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        var subtractBoxersWeight = (firstBoxerWeight - secondBoxerWeight) * -1;
        System.out.println("Общая масса двух бойцов: " + sumBoxersWeight + " кг");
        System.out.println("Разница между массами бойцов: " + subtractBoxersWeight + " кг\n");

        // Задача 7
        var subtractBoxersWeight2 = (firstBoxerWeight - secondBoxerWeight) * -1;
        var remainder = secondBoxerWeight % firstBoxerWeight;
        System.out.println(subtractBoxersWeight2);
        System.out.println("\"С помощь функции остаток от деления.\" " + remainder + "\n");

        // Задача 8
        var totalWorkTime = 640;
        var workerWorkTime = 8;
        var totalWorkers = totalWorkTime / workerWorkTime;
        System.out.println("Всего работников в компании — " + totalWorkers + " человек");

        totalWorkers = totalWorkers + 94;
        var newTotalWorkTime = 640.0 / totalWorkers;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + newTotalWorkTime + " часов работы может быть поделено между сотрудниками");




    }
}