import java.util.Arrays;

public class Main {
    private Gryffindor[] gryffindorStudents = new Gryffindor[3];
    private Slytherin[] slytherinStudents = new Slytherin[3];
    private Hufflepuff[] hufflepuffStudents = new Hufflepuff[3];
    private Ravenclaw[] ravenclawStudents = new Ravenclaw[3];

    public static void main(String[] args) {
        Main hogwards = new Main();

        hogwards.gryffindorStudents[0] = new Gryffindor("Гарри Поттер", 94, 89, 100, 91, 99);
        hogwards.gryffindorStudents[1] = new Gryffindor("Гермиона Грейнджер", 100, 76, 80, 90, 78);
        hogwards.gryffindorStudents[2] = new Gryffindor("Рон Уизли", 89, 67, 90, 81, 94);

        hogwards.slytherinStudents[0] = new Slytherin("Драко Малфой", 70, 90, 99, 100, 97, 80, 99);
        hogwards.slytherinStudents[1] = new Slytherin(" Грэхэм Монтегю", 90, 50, 70, 99, 10, 71, 50);
        hogwards.slytherinStudents[2] = new Slytherin("Грегори Гойл", 99, 60, 100, 64, 18, 11, 50);

        hogwards.hufflepuffStudents[0] = new Hufflepuff("Захария Смит", 100, 87, 60, 83, 89);
        hogwards.hufflepuffStudents[1] = new Hufflepuff("Седрик Диггори", 80, 57, 90, 99, 70);
        hogwards.hufflepuffStudents[2] = new Hufflepuff(" Джастин Финч-Флетчли", 54, 90, 86, 50, 11);

        hogwards.ravenclawStudents[0] = new Ravenclaw("Чжоу Чанг", 70, 41, 99, 56, 39, 18);
        hogwards.ravenclawStudents[1] = new Ravenclaw("Падма Патил", 99, 80, 64, 100, 99, 56);
        hogwards.ravenclawStudents[2] = new Ravenclaw("Маркус Белби", 61, 80, 34, 79, 65, 90);

        System.out.println("Список всех учеников и их характеристика:");
        for(int i = 0; i < hogwards.gryffindorStudents.length; i++) {
            System.out.println(hogwards.gryffindorStudents[i]);
        }
            for (int o = 0; o < hogwards.slytherinStudents.length; o++) {
                System.out.println(hogwards.slytherinStudents[o]);
            }
             for (int j = 0; j < hogwards.hufflepuffStudents.length; j++) {
                 System.out.println(hogwards.hufflepuffStudents[j]);
             }
                 for (int d = 0; d < hogwards.ravenclawStudents.length; d++){
                     System.out.println(hogwards.ravenclawStudents[d]);
                 }


        System.out.println("Сравнение двух учеников по свойствам:");
        hogwards.gryffindorStudents[0].compareWith(hogwards.gryffindorStudents[1]);
        hogwards.ravenclawStudents[2].compareWith(hogwards.ravenclawStudents[1]);


        System.out.println("Сравнение двух учеников по силе магии и расстоянию трансгрессии:");
        hogwards.slytherinStudents[1].compare(hogwards.slytherinStudents[0]);
        hogwards.hufflepuffStudents[2].compare(hogwards.hufflepuffStudents[1]);
    }
}
