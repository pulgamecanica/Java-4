public class Test{
	public static void main(String[] args){
		Time t1 = new Time("11:20:20");
		Time t2 = new Time(11, 40, 19);
		t1.addM(10);
		System.out.println(t1);
		System.out.println(t1.compareTime(t2));
		System.out.println(t1.subTimes(t2));
	}
}