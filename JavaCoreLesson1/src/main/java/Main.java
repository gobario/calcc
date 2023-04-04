public class Main {
    public static void main(String[] args) {
        Team team = new Team("Бесславные ублюдки", 11, "Ahmed", 6, "Sebastian", 9, "Lola", 10, "Forest"); // создаём экземпляр класса
        team.teamInfo(); // выводим информацию о членах команды
        Course course = new Course(1, 2, 3, 4); // создаём экземпляр полосы препятствий
       course.doIt(team); // просим команду бежать
       team.showResults(course); //выводим имена участников, которые пробежали все препятствия
    }
}
