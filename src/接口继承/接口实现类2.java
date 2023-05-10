package 接口继承;


import 接口.接口实现类;

public class 接口实现类2 implements 接口说明6{
	@Override
	public void setHomeTeam(String name) {
		 System.out.println("1");
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO 自动生成的方法存根
		 System.out.println("2");
	}

	@Override
	public void homeTeamScored(int points) {
		// TODO 自动生成的方法存根
		 System.out.println("3");
	}

	@Override
	public void visitingTeamScored(int points) {
		// TODO 自动生成的方法存根
		 System.out.println("4");
	}

	@Override
	public void endOfQuarter(int quarter) {
		// TODO 自动生成的方法存根
		 System.out.println("5");
	}

	@Override
	public void homeGoalScored() {
		// TODO 自动生成的方法存根
		 System.out.println("6");
	}

	@Override
	public void visitingGoalScored() {
		// TODO 自动生成的方法存根
		 System.out.println("7");
	}

	@Override
	public void endOfPeriod(int period) {
		// TODO 自动生成的方法存根
		
		 System.out.println(period);
	}

	@Override
	public void overtimePeriod(int ot) {
		// TODO 自动生成的方法存根
		 System.out.println("9");
	}


	 
	   public static void main(String args[]){
	      接口实现类2 y = new 接口实现类2();
	      y.endOfPeriod(8);
	      y.setHomeTeam(null);

	   }

	



	}
