public class Time{
	private int hh, mm, ss;

	public Time(int hh, int mm, int ss){
	this.hh = hh;
	this.mm = mm;
	this.ss = ss;
	}
	public Time(String args){
		hh = Integer.parseInt(getTheHH(args));
		mm = Integer.parseInt(getTheMM(args));
		ss = Integer.parseInt(getTheSS(args));
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
	//
	public int getH(){
		return hh;
	}
	public int getM(){
		return mm;
	}
	public int getS(){
		return ss;

	}
	public void addH(int a){
		if(hh + a > 24)
			hh = 0;
		else
			hh += a;
	}
	public void addM(int a){
		if (mm + a > 60){
			addH(1);
			addM(a - 60);
		}else{
			mm += a;
		}
	}
	public void addS(int a){
		if (ss + a > 60){
			addM(1);
			addS(a - 60);
		}else{
			ss += a;
		}	
	}
	public boolean compareTime(Time t){
		if(t.getH()<getH())
			return false;
		else if(t.getH()>getH())
			return true;
		else if(t.getM()<getM())
			return false;
		else if(t.getM()>getM())
			return true;
		else if(t.getS()<getS())
			return false;
		else if(t.getS()>getS())
			return true;
		return true;
	}
	public Time addTimes(Time t){
		addH(t.getH());
		addM(t.getM());
		addS(t.getS());
		return this;
	}
	public Time subTimes(Time t){
		if(compareTime(t))
			return t.subTimes(this);
		else{
			addH(-1*t.getH());
			addM(-1*t.getM());
			addS(-1*t.getS());
			return this;
		}
	}


	public String toString(){
		return "The time is: " + hh + ":" + mm + ":" + ss;
	}

}