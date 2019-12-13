package practical;

public class Sport {
    private String sportName;
    private int teamSize;
    public Sport(String sname, int ssize)
    {
        sportName=sname;
        teamSize=ssize;
    }
    public void setSportName(String name)
    {
        sportName=name;
    }
    public void setTeamSize(int size)
    {
        teamSize=size;
    }
    public String getSportName()
    {
        return sportName;
    }
    public int getTeamSize()
    {
        return teamSize;
    }
}
