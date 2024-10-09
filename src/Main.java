public class Main {
    public static void main(String[] args) {

                var d = 8.0;
                var cat = 3.6;
                var paper = 763789;
                var friend = 19;
                var frog = 3.5;
                var weight1fighter = 78.2;
                var weight2fighter = 82.7;

                System.out.println("zadanie 1");
                System.out.println(dog);
                System.out.println(cat);
                System.out.println(paper);

                System.out.println();
                System.out.println("zadanie 2");
                dog = dog + 2;
                System.out.println(dog);
                cat = cat + 2;
                System.out.println(cat);
                paper = paper + 2;
                System.out.println(paper);

                System.out.println();
                System.out.println("zadanie 3");
                System.out.println(dog - 3.5);
                System.out.println(Math.ceil(cat - 1.6));
                System.out.println(paper - 7639);

                System.out.println();
                System.out.println("zadanie 4");
                System.out.println(friend);
                friend = friend + 2;
                System.out.println(friend);
                System.out.println(friend / 7);

                System.out.println();
                System.out.println("zadanie 5");
                System.out.println(frog);
                frog = frog * 10;
                System.out.println(frog);
                frog = frog / 3.5;
                System.out.println(frog);
                frog = frog + 4;
                System.out.println(frog);

                System.out.println();
                System.out.println("zadanie 6");
                var weightfighter = weight2fighter + weight1fighter;
                System.out.println("общий вес бойцов:" +weightfighter);
                weightfighter = weight2fighter - weight1fighter;
                System.out.println("Разница массы бойцов:" +weightfighter);

                System.out.println();
                System.out.println("zadanie 7");
                weightfighter = weight2fighter % weight1fighter;
                System.out.println(weightfighter);

                System.out.println();
                System.out.println("zadanie 8");
                var time = 640;
                var PeopleWorkTime = 8;
                var people = time/PeopleWorkTime;
                System.out.println("Всего работников в компании — " +people +" человек");
                people = people  + 94;
                time = people * PeopleWorkTime;
                System.out.println("Если в компании работает" +people+  " человек, то всего " +time+ " часов работы может быть поделено между сотрудниками");

            }
        }