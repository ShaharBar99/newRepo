import java.util.List;

public class SharedData 
{
	private int [] array;
	private List<Integer> winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}

	public List<Integer> getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(List<Integer> winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
