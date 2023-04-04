public class Course {
    private int ob1, ob2, ob3, ob4;
    private int[] obstacles;
    private int sum;

    //конструктор принимает на себя числа, обозначающие препятствия(каждое препятствие тратит энергию участника)
    public Course(int ob1, int ob2, int ob3, int ob4) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
        this.ob4 = ob4;
    }
    //метод, собирающий массив препятствий
    public void courseToArray() {
        int[] obstacles = new int[4];
        obstacles[0] = ob1;
        obstacles[1] = ob2;
        obstacles[2] = ob3;
        obstacles[3] = ob4;
        this.obstacles = obstacles;
    }
    //геттер, возвращает сумму всех препятствий
    public int getResult() {
        courseToArray();
        int sum = 0;
        for (int i = 0; i < obstacles.length; i++) {
            sum = sum + obstacles[i];
        }
        this.sum = sum;
        return sum;
    }
    //метод просит команду пройти полосу
    public void doIt(Team x) {
            System.out.println("Команда " + x.getTeamName() + " бежит полосу с препятствиями!");
        }
}
