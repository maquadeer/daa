/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort49;

/**
 *
 * @author student
 */
public class Mergesort49 {
  
    void mergesort(int l, int h, int a[])
    {
    int m=(l+h)/2
    if(l<h)
    {
    mergesort(l,m,a[])
    mergesort(m+1,h,a[])
    merge(a,l,m,h)
    }   
    }
void merge(int a, int l, int m, int h)
{
    int []b = new int[10];
    int i, j, k, p;
    i=l
    j=m+1
    k=l
    while((i<=m)&&(j<=h))
    {
        if(a[i]<a[j])
        {
            b[k]=a[i];
            i++
        }
        else
        {
            b[k]=a[j]
            j++
        }
        k++
    if(j>h)
    {
        
    }
        
        
        
        
        
        }





}
public static void main(String[] args) {
        // TODO code application logic here

        int a[20]={1,2,32,6,64,43,56,9,8}
        
    
    
    
    
    }
    
}
