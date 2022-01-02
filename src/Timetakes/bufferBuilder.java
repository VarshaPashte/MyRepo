package Timetakes;

public class bufferBuilder {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<10000;i++){
			sb.append("edubridge ");
		}
		System.out.println("Time taken by StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
		
		
		long startTime1=System.currentTimeMillis();
		StringBuilder sb22=new StringBuilder("java");
		for(int i=0;i<10000;i++){
			sb.append("edubridge ");
		}
		System.out.println("Time taken by StringBuilder: "+(System.currentTimeMillis()-startTime1)+"ms");
		
	}

}
