package p05_29;

public class Test1 {
	public static void main(String[] args) {
		byte a = 127;
		a = 100;
		//a = 128; type mismatch
		
		byte aa = (byte)128;
		long bLong = 1234567890;
		long bb = 1234567890l; 
		long bbb = 1234567890123456789L;
		float cFloat = 0.1f;
		/* int(32bit), double(64bit)이 디폴트니까,,, 
		디폴트 아닌 long(64), float(32)는 각각 l, f 붙여야 함 */
		
		// ---형변환---//
		cFloat = bLong; //오류 없음. 실수 float > 정수 long 이니까
		//bLong = cFloat; 오류 발생!! 큰 걸 작은 그릇에 못 담죠
		bLong = (int)cFloat; // 큰 float을 long보다 작은 int로 잘라서 넣기 = 수동 형변환
		char dChar = 'd';
		System.out.println(dChar);
		boolean eBoolean = false;
		String sString = "abcd1234 @341#$@#%가나다";
		int fInt = 'f'; //자동 형변환. int(32)>char(16)
		System.out.println(fInt);
		
		System.out.println((char)fInt);
		
		
		
		
		
		int c = (int)0.1234;
		
		double d = 1;
		
		int e = 'a';
		System.out.println(e);
		e = (char)'a';
		System.out.println(e);
		
		System.out.println("Hello world!! git도 안녕!!");
		
	}

}
