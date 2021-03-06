public class Quicksort 
{ 
    /* This function takes an array and its lowest and highest index as input 
    and returns index of the pivot element in the array. The funcion places element of the array greater than
    the pivot element to the right of the pivot and elements lesser than the pivot to the left */
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high]; // We set pivot element to be the element at the end of the array or with highest index
        int i = (low - 1); 
        for (int j = low; j < high; j++) 
        { 
            if (arr[j] <= pivot) 
            { 
                i++; 
                int a = arr[i];  
                arr[i] = arr[j]; // Swapping arr[i] and arr[j]
                arr[j] = a; 
            } 
        } 
  
        int a = arr[i + 1];        // Swap arr[high] with arr[i + 1]
        arr[i + 1] = arr[high]; 
        arr[high] = a; 
  
        return i + 1 ;              // Return positional index of the pivot element
    } 
  
    // This function performs partition function recursively
    void qsort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pseudopivot = partition(arr, low, high);     // Recursively perform partition on the resultant arrays
            qsort(arr, low, pseudopivot - 1); 
            qsort(arr, pseudopivot + 1, high); 
        } 
    } 
  
    // For printing the elements of the array
    static void printArray(int arr[])              
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    //Driver code
    public static void main(String args[])     // For performing the Quicksort algorithm on given array of finite length
    { 
        int arr[] = {10, 7, 8, 9, 1, 5};       // assign an array of your choice
        int n = arr.length; 
  
        Quicksort object = new Quicksort(); 
        object.qsort(arr, 0, n - 1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
}
