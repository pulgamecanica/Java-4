public class Test{
	public static void main(String[] args){
		Time t1 = new Time("11:59:40");
		Time t2 = new Time(2, 40, 19);
		t1.addS(893);
		System.out.println(t1);
		System.out.println(t2);
		// System.out.println(t1.compareTime(t2));
		// System.out.println(t1.addTimes(t2));
		// System.out.println(t1.subTimes(t2));

	}
}