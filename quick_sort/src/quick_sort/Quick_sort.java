/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_sort;

/**
 *
 * @author student
 */
public class Quick_sort {
    int partition(int arr[] ,int low,int high ){
        int i=low,j=high,v=arr[low];
        do{
            do{
                i++;
            }while(arr[i]<v);
            do{
                j--;
            }while(arr[i]>v);
        }while(i<j);
        
        if(i<j){
            int temp = arr[i];
           arr[i]= arr[j];
           arr[j]=temp;
        }
        return j;
    }
    
    void sort(int arr[],int low,int high)
    {
        if(low < high)
        {
            int q = partition(arr,low,high);
            
            sort(arr,low,q-1);
            sort(arr,q+1,high);
        }
    }
    public static void main(String[] args) {

        int  arr[] = {5,4,3,2,1,9999};
        int n = arr.length;
        
       Quick_sort ob = new Quick_sort();
       ob.sort(arr,0,n-1);
        
       
    }
    
}
