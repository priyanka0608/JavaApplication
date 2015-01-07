import java.util.*; 
  class Explorer2 { 
 public static void main(String[] args)
 { 
	 
System.out.println("hello world");
callMe();
 }
 
 public static void callMe() {
	 System.out.println("You call me...So swt!!!! I will be coming");
	 System.out.println("Learning git merge.");
	 callMe1();
 }

 public static void  callMe1() {
 System.out.println("I will not  come");
 System.out.println("logging things");
 System.out.println("Open KDIFF3");
 multipleCommitsTry1();
 }
 
 public static void multipleCommitsTry1() {
	 System.out.println("First commit in multi commit way");
	 multipleCommitsTry2();
 }
 
 public static void multipleCommitsTry2() {
	 System.out.println("Second commit in multi commit way");
	 System.out.println("Amending second commit");
	 multipleCommitsTry3();
 }
 
 public static void multipleCommitsTry3() {
	 System.out.println("Third commit in multi commit way");
 }
  }
