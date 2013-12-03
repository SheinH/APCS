/*
  Shein Htike
  Period 8
  HW#35
  2012-12-1
*/
public class SearchTrials{
    public static void main(String[] args){
	Comparable[] list = new Comparable[500000];
	for(int y = 0;y < list.length;y++){
	    list[y] = new Binary(y);
	}
	
	System.out.println("Testing linear search:");
	long before = System.currentTimeMillis();
	BinSearch.linSearch(list,new Binary(128));
	long after = System.currentTimeMillis();
	System.out.println("Match found!");
	System.out.println("Time: " + (after - before));
	System.out.println("Testing binary search:");
	before = System.currentTimeMillis();
	BinSearch.binSearch(list,new Binary(250000));
	after = System.currentTimeMillis();
	System.out.println("Match found!");
	System.out.println("Time: " + (after - before));
    }
}
