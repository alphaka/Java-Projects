public class OurArrayList {

	private int numElements;

	private int[] arr;

	public OurArayList() {

		numElements = 0;

		arr = new int[10];

	}

	public int size() {

		return numElements;

	}

	public int get(int index) {

		if(index <0 || index >= size())
			throw new IndexOutOfBoundException();

		return arr[index];
	}

	public int set(int index, int value) {

	 // replaces the old value at index with a new value and return the original value


		if(index<0 || index>= size())
			throw new IndexOutOfBoundException();
		int oldValue = arr[index]

		arr[index] = value;

		return oldValue;

	}

	public void add(int value) {

		if(numElements == arr.length) {

			int[] temp = new int[arr.length*2];
		
		for(int i=o; i<arr.length; i++)
			temp[i]= arr[i];

		arr = temp;

		}

		arr[numElements] = values;
		numElements++;

	}

} // end OurArrayList
