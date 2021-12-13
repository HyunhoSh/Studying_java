public class ArrList<E>{
   private E[] a;
   private int size;
   
   ArrList(){
	   a = (E[]) new Object[50];
	   size = 0;
   }
   
   private void rangeCheck(int idx) {
       if (idx < 0 || idx >= this.size) {
           throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + this.size);
       }
   }
   
   

   void add(E e) {
	   a[size++] = e;
	   
   }
   
   
   void add(int y, E u) {
	   for(int i=size-1;i>=y;i--) {
		   a[i+1] = a[i];
	   }
	   a[y] = u;
	   size++;
	   
   }
   
   E get(int b) {
	   rangeCheck(b);
	   
	   return (E) a[b];
   }
   
   int size() {
	   
	   return size;
   }
   
   void show() {
	   for(int i=0;i<size;i++) {
		   System.out.print(a[i]+" ");
	   }
	   System.out.println();
   }
   
   void remove(int j) {
	   rangeCheck(j);
	   
	   E old = (E) a[j];
	   
	   for(int i= j;i<size-1;i++) {
		   a[i] = a[i+1];
	   }
	   size--;
	   
	   
   }
   
}
