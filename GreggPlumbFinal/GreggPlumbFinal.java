public void switchArray(int a){
	int N = a.length;
	int[] be = new int[N];
	for(int II = 0; II < N; II ++){
		be[II] = a[N - II - 1];
	}
}