import java.util.*;

    public class hashmap<k,v> {
        class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }


        private int n; // nodes
        private int N;// buckets
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")

        public hashmap() {
            this.N=4;
            this.buckets=new LinkedList[4];
            for (int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }

        }

        private void rehashing() {
        LinkedList<Node> oldBucket[]=buckets;
        buckets=new LinkedList[N*2];
        for(int i=0;i<N*2;i++){
            buckets[i]=new LinkedList<>();
        }
        for(int i=0;i<oldBucket.length;i++){
            LinkedList<Node> ll=oldBucket[i];
            for(int j=0;i<ll.size();j++){
                Node node=ll.get(j);
                put(node.key, node.value);
            }
        }

        }

         private int hashfunction(k key){   // 0 to n-1
         int bi=key.hashCode();
           return Math.abs(bi)%N;
         }
        int searchinLL(k key, int bi){
          LinkedList<Node> ll=buckets[bi];
          for (int i=0;i<ll.size();i++){
              if(ll.get(i).key==key){
                  return i;
              }
          }
          return -1;
        }

        public void put(k key,v value) {
         int bi=hashfunction(key);
         int di=searchinLL(key,bi);
         if(di==-1){ // key doesnot exist
             buckets[bi].add(new Node(key,value));
            n++;

         }else{
            Node node = buckets[bi].get(di);
            node.value=value;

         }

         double lamda=(double) n/N;
         if(lamda>2.0){
             rehashing();
         }

        }

        public v get(k key) {
         int bi=hashfunction(key);
         int di=searchinLL(key,bi);
         if(di==-1){
             return null;
         }
         else{
             Node node= buckets[bi].get(di);
             return node.value;

         }
        }

        boolean containskey(k key) {

            int bi=hashfunction(key);
            int di=searchinLL(key,bi);
            if(di==-1)
                return false;
            else
                return true;
        }
        public v remove(k key){
            int bi=hashfunction(key);
            int di=searchinLL(key,bi);
            if(di==-1){
                return null;
            }
            else{
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;

            }
        }
       public ArrayList<k> keyset(){
            ArrayList<k> keys=new ArrayList<>();
            for (int i=0;i< buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for (int j=0;j<ll.size();j++){
                    keys.add(buckets[i].get(j).key);
                }
            }
            return keys;
       }
       public boolean isEmpty(){
            return n==0;
       }
       public void print (){

       }

    }

