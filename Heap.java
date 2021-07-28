public class Heap{
    Node[] arr;
    int max;
    int curr;

    Heap(int max){
        this.max=max;
        this.arr=new Node[max];
    }
    void insert(int data){
        if(max==curr){
            System.out.println("Heap is full");
            return;

        }
        Node node=new Node(data);
        arr[curr]=node;
        trickleUp(curr++);
    }
    void grickleUp(int index){
        int parent=(index-1)/2;
        Node bottom=arr[index];
        while(index>0 && arr[parent].data>bottom.data){
            arr[index]=arr[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        arr[index]=bottom;
    }

    int remove(){
        if(curr==0){
            System.out.println("Heap is empty");
            return -1;
        }
        Node top=arr[0];
        arr[0]=arr[--curr];
        arr[curr]=null;
        trickleDown(0);
        return top.data;
    }
    void trickleDown(int index){
        Node top=arr[index];
        int largeChild=0;
        while(index<curr/2){
            int leftChild=2*index+1;
            int rightChild=2*index+2;
            if(rightChild<curr && arr[leftChild].data>arr[rightChild].data)
                largeChild=rightChild;
            else
                largeChild=leftChild;
            
            if(top.data<arr[largeChild].data)break;
            arr[index]=arr[largeChild];
            index=largeChild;
        }
        arr[index]=top;
    }
    public static void main(String[] args){
        int[] arr={12,13,9,8,3,3,1,7,6,2,9,8,1,0,10,11};
        Heap heap=new Heap(arr.length);
        for(int e:arr)
            heap.insert(e);

        while(heap.curr!=0){
            System.out.print(heap.remove()+",");
        }
    }

    static class Node{
        int data;
        Node(int data){
            this.data=data;
        }
    }
}
