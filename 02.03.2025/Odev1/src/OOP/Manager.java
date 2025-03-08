package OOP;

public class Manager extends Employee {
    private int teamsize;

    public Manager(String name, int id, double salary, String department, int teamsize) {
        super(name, id, salary, department);//yukardakilerin hepsini yazmamak için üst kullandığı özellikleri aşağı çekiyor
        this.teamsize = teamsize;
    }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }




}

