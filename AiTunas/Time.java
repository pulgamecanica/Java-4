public class Time{
	private int seconds;

	public Time(int hh, int mm, int ss){
		seconds = getSeconds(hh, mm, ss);
	}
	public Time(String args){
		int hh = Integer.parseInt(getTheHH(args));
		int mm = Integer.parseInt(getTheMM(args));
		int ss = Integer.parseInt(getTheSS(args));
		seconds = getSeconds(hh, mm, ss);
	}
	public String getTheHH(String arg){
		return arg.substring(0,2);
	}
	public String getTheMM(String arg){
		return arg.substring(3,5);
	}
	public String getTheSS(String arg){
		return arg.substring(6,8);
	}
	public int getSeconds(int hh, int mm, int ss){
		return hh * 3600 + mm * 60 + ss;
	}
	//
	public int getH(){
		return seconds/3600;
	}
	public int getM(){
		int result = seconds/60;
		while(result >= 60){
			result -= 60;
		}
		return result;
	}
	public int getS(){
		int result = seconds;
		while(result >= 60){
			result -= 60;
		}
		return result;
	}
	public void addH(int a){
		seconds += a * 3600;
	}
	public void addM(int a){
		seconds += a * 60; 
	}
	public void addS(int a){
		seconds += a;	
	}

	public boolean compareTime(Time t){
		if(getH()<t.getH())
			return false;
		else if(getH()>t.getH())
			return true;
		else if(getM()<t.getM())
			return false;
		else if(getM()>t.getM())
			return true;
		else if(getS()<t.getS())
			return false;
		else if(getS()>t.getS())
			return true;
		return true;
	}
	public Time addTimes(Time t){
		Time result = new Time(getH(), getM(), getS());
		result.addH(t.getH());
		result.addM(t.getM());
		result.addS(t.getS());
		return result;
	}
	public Time subTimes(Time t){
		if(compareTime(t)){
			Time result = new Time(getH(), getM(), getS());
			result.addH(-1 * t.getH());
			result.addM(-1 * t.getM());
			result.addS(-1 * t.getS());
			return result;
		}else{
			Time result = new Time(t.getH(), t.getM(), t.getS());
			result.addH(-1 * getH());
			result.addM(-1 * getM());
			result.addS(-1 * getS());
			return result;
		}
	}
	public String toString(){
		return "The time is: " + getH() + ":" + getM() + ":" + getS();
	}
}