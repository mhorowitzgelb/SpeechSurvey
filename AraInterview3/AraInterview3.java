public int[] reverse (int[] x){
	int[] result = new int[x.length];
	for(int i; i < result.length; i ++){
			result[result.length -1 -i] = x[i];
	}
	return result;
}