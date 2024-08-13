package Assignment;

public class Determine_By_Rotation {

	public static void main(String[] args) {
		int[][]arr= {{0,1},
				      {1,1}};
		int[][]target= {{1,0},{0,1}};
		System.out.println(Rotate(arr,target));

	}
	public static boolean Rotate(int[][]arr,int[][]target) {
		int rotate=arr.length-1;;
        int r1=1;
        while(r1<=rotate){
            for(int i=0;i<arr.length;i++) {
			    for(int j=i+1;j<arr[0].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			    }
		    }
		    for(int row=0;row<arr.length;row++) {
                int i =0;
                int j =arr.length-1;
			    while(i<j) {
                    int temp =arr[row][i];
                    arr[row][i]=arr[row][j];
                    arr[row][j]=temp;
                    i++;
                    j--;
				
			    }
		    }
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(arr[i][j]!=target[i][j]){
                    r1++;
                    }
                    
                }
            }
            return true;	
	    }
        return false;
    }

}
