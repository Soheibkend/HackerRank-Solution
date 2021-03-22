public class CutTheSticks {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
         Arrays.sort(arr);
        int n=arr.length;
        int temp=arr[0];
        int count=1;
        for(int i=0;i<n;i++){
            if(arr[i]==temp){
                continue;
            }
            else{
                temp=arr[i];
                count++;
            }
        }
        int[] array=new int[count];
        temp=arr[0];
        int j=0;
        int con=0;
        array[j++]=n;
        for(int i=0;i<n;i++){
            if(arr[i]==temp){
                con++;
            }
            else{
                temp=arr[i];
                System.out.println(con);
                array[j++]=n-con;
                con++;
            }
        }
        return array;

    }
}