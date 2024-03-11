public class MultiThreadedSearch {
    static volatile boolean found = false;
}

static class SearchTask implements Runnable{
    private final int[] arr;
    private final int Searchno;
    private final int start;
    private final int end;

    public SearchTask(int[] arr, int Searchno,int start,int end){
      this.arr = arr;
      this.Searchno = Searchno;
      this.start = start;
      this.end = end;
    }
    public void run(){
        for(int i = 0; i<end;i++){
             if(arr[i] == Searchno){
                found = true;

             }
        }
    }
}


public class MultiThreadedSearch {
    static boolean found = false;
}
