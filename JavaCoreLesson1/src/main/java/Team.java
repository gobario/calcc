public class Team {
    public String teamName;
    public int nrg1, nrg2, nrg3, nrg4;
    public String name1, name2, name3, name4;
    public String[] nameArray;
    public int[] teamArray;

    // конструктор принимает название команды и поочерёдно энергию и имя участника
    public Team(String teamName, int nrg1, String name1, int nrg2, String name2, int nrg3, String name3, int nrg4, String name4) {
        this.nrg1 = nrg1;
        this.nrg2 = nrg2;
        this.nrg3 = nrg3;
        this.nrg4 = nrg4;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.teamName = teamName;
    }
    //метод, который собирает имена участников в массив
    public void nameToArray(){
        String[] nameArray = new String[4];
        nameArray[0] = name1;
        nameArray[1] = name2;
        nameArray[2] = name3;
        nameArray[3] = name4;
        this.nameArray = nameArray;
    }
    // метод, который собирает энергии участников в массив
    public void teamToArray() {
        int[] teamArray = new int[4];
        teamArray[0] = nrg1;
        teamArray[1] = nrg2;
        teamArray[2] = nrg3;
        teamArray[3] = nrg4;
        this.teamArray = teamArray;
    }
    //метод, который выводит информацию о членах команды
    public void teamInfo() {
        System.out.print("Состав команды " + teamName + ": ");
        System.out.println(name1 + ", " + name2 + ", " + name3 + ", " + name4 + ".");
        }
        //геттер имени команды
        public String getTeamName(){
        return teamName;
        }
        //метод, показывающий членов команды, прошедших дистанцию(энергия участника сравнивается с суммой препятствий)
        public void showResults(Course o) {
        teamToArray();
        nameToArray();
            for (int i = 0; i < teamArray.length; i++) {
                if (teamArray[i] >= o.getResult()) System.out.println(nameArray[i] + " успешно пробежал полосу препятсвий!");
            }
        }
    }
