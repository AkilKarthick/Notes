package java15interface;

import java.util.Collections;
import java.util.Objects;

/*
 * 
public class RecordKeywordDemo {

	private int x =1;
	private int y =1;
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecordKeywordDemo other = (RecordKeywordDemo) obj;
		return x == other.x && y == other.y;
	}
	@Override
	public String toString() {
		return "RecordKeywordDemo [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

*/

// you can avoid all the above constructor, getters, equals, hashCode, toString. by usnig 
	//Records are immutable by design — all fields are final
//Short and concise to avoid a lot of boiler plate code

	public record RecordKeywordDemo(int x, int y) {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecordKeywordDemo demo1 = new RecordKeywordDemo(1,2);
		System.out.println(Collections.sort(Comparable(dem))))
		
	}

}
