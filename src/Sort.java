
public class Sort {

    String [] arr = {"Mersedes-Benz","Kia", "Volvo", "Nisan", "Deo", "Cherry" };
    String temp;

    public void sort() {

    for (int i = arr.length-1; i > 0; i--) {
        //String min =arr[0];
        for (int k = 0; k < i; k++ ){

            if (arr[k].length() > arr[k+1].length() ) {

               // min = arr[k];
                temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1]=temp;
            }
        }



    }


}

    public static void main(String[] args) {
        Sort mysort = new Sort();
        mysort.sort();

        for (int i = 0; i < mysort.arr.length; i++) {
            System.out.println(mysort.arr[i]);
        }
    }
}
/*	Sort list or array by string length (Отсортировать список по длине строк)*/

/*public class ArraySort {

    public static void main (String args[]){
        String[] myArray = {"Mercedes","Kia","Bugatti","Honda"};
        for(int i = myArray.length-1; i > 0; i--){
            for (int j = 0; j<i;j++){
                if(myArray[j].length() > myArray[j+1].length()) {
                    String tmp = myArray[j];
                    myArray[j] =myArray[j+1];
                    myArray[j+1] = tmp;
                }
            }
        }
    }
}*/