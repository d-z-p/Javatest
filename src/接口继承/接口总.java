package 接口继承;



interface 接口说明4
{
public void setHomeTeam(String name);
public void setVisitingTeam(String name);
}

interface 接口说明5
{
String PROP_B = "B";
public void homeTeamScored(int points);
public void visitingTeamScored(int points);
public void endOfQuarter(int quarter);

}
interface 接口说明6 extends 接口说明4, 接口说明5
{
String PROP_C = "a";
public void homeGoalScored();
public void visitingGoalScored();
public void endOfPeriod(int period);
public void overtimePeriod(int ot);
}


