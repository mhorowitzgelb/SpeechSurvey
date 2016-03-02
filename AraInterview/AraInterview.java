public void printCount (int n) {
	for(int i=1; i<=n ;i++){
		System.out.println(i);
	}
}

public void reverser (int[] x){
	int[] results = new int[x.length];
	for(int i = 0; i < x.length; i ++){
		results[x.length - 1 -i] = x[i];