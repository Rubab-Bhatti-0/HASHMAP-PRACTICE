import java.util.*;

public class Main {

//    public static List<Integer> majorityElement(int[] nums) {
//        ArrayList<Integer> ll=new ArrayList<>();
//        hashmap<Integer,Integer> map=new hashmap<>();
//        for (int i=0;i<nums.length;i++){
//            if(map.containskey(nums[i]))
//            map.put(nums[i],map.get(nums[i])+1);
//            else map.put(nums[i],1);
//        }
//        for (int key:map.keyset()){
//            if(map.get(key)>nums.length/3)
//                ll.add(key);
//        }
//        return ll;
//    }

    public static int[] intersect_duplicates(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for (int num:nums1){
            if(map1.containsKey(num))
            map1.put(num,map1.get(num)+1);
            else
                map1.put(num,1);

        }
        for (int num:nums2){
            if(map2.containsKey(num))
                map2.put(num,map2.get(num)+1);
            else
                map2.put(num,1);
        }
        int length;

            for (int key : map1.keySet()) {
                if (map2.containsKey(key)) {
                    while(map1.get(key)>0&&map2.get(key)>0) {
                        res.add(key);
                        map1.put(key, map1.get(key) - 1);
                        map2.put(key, map2.get(key) - 1);
                    }
//
//                int count=map2.get(key);
//                int count1= map2.get(key);
//                if(count>count1)
//                    length=count;
//                else
//                    length=count1;
//             //   if(count==map1.get(key))
//               // if(map2.get(key)==map1.get(key)){
//                   // int i=0;
//                 //   while(i<length){
//                    for (int i=0;length>1&&i<length;i++){
//                        res.add(key);
//                   // i++;
//
//                }
////                else
////                    res.add(key);

                }
            }

        int intesect[]=new int[res.size()];
        for (int i=0;i<res.size();i++){
            intesect[i]=res.get(i);
        }
        return  intesect;

    }

          public static int[] intersection(int[] nums1, int[] nums2) {

              HashSet<Integer> set=new HashSet<>();
              ArrayList<Integer> result=new ArrayList<>();
              //    HashSet<Integer> result=new HashSet<>();
              for (int i=0;i<nums1.length;i++){
                  set.add(nums1[i]);
              }
              for (int i=0;i<nums2.length;i++){
                  if(set.contains(nums2[i])){
                    result.add(nums2[i]);

                    set.remove(nums2[i]);
                  }
              }
              int intersect[]=new int[result.size()];
//              int i=0;
              for (int i=0;i<result.size();i++){
                  intersect[i]=result.get(i);
              }
//              for (int key:result){
//                  intersect[i]=key;
//                  i++;
//              }

              return intersect;


          }
public static List<Integer> majorityElement(int[] nums) {
    ArrayList<Integer> ll=new ArrayList<>();
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i]))
            map.put(nums[i],map.get(nums[i])+1);
        else map.put(nums[i],1);
    }
    for (int key:map.keySet()){
        if(map.get(key)>nums.length/3)
            ll.add(key);
    }
    return ll;
}
     public static HashSet<Integer> union(int arr1[],int arr2[]){
    HashSet<Integer> set=new HashSet<>();
    for (int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for (int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
    }
    return set;
     }
    public static void main(String[] args) {
    hashmap<String,Integer> map=new hashmap<>();
        System.out.println(map.isEmpty());
    map.put("Pakistan",15);
        map.put("Iran",10);
        map.put("Iraq",11);
        map.put("Canada",12);
        System.out.println(map.get("Pakistan"));
        System.out.println(map.get("india"));
        ArrayList<String> countries=map.keyset();
       for (int i=0;i<countries.size();i++){
           System.out.println(countries.get(i)+": "+map.get(countries.get(i)));
       }
        System.out.println(map.isEmpty());
        System.out.println(map.containskey("Iran"));
        System.out.println( map.containskey("bangladesh"));
        System.out.println(map.remove("Canada"));
        System.out.println(map.remove("india"));
        Iterator tt=map.keyset().iterator();
        while(tt.hasNext()){
            System.out.print(tt.next()+" , ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------");

        System.out.println(" --------------------------- hashset --------------------------");
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(2);
        System.out.println(set);
        System.out.println(set.contains(5));
        System.out.println(set.contains(7));
        System.out.println(set.remove(7));
        System.out.println(set.remove(2));
        System.out.println("set size: "+ set.size());
        System.out.println(set);
        Iterator it= set.iterator();
        // has next function
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        System.out.println("------------------------------------------------");
        System.out.println(" -------------------- Hashing questions ---------------------------");

        System.out.println(" Majority element question:");
        int arr1[]={3,2,3,8,6,6,6,5};
        int arr2[]={4,9,5};
        int arr4[]={9,4,9,8,4};
        int arr3[]={1,2,6,5,6};
        List<Integer> l1 = majorityElement(arr3);
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("-----------------------------------------");
        System.out.println(" ------------------- union of 2 arays -----------------------");
         HashSet<Integer> union_set=union(arr1,arr3);
         Iterator setit=union_set.iterator();
        System.out.println("total size: "+ union_set.size());
         while (setit.hasNext()){
             System.out.print(setit.next()+" , ");
         }
        System.out.println();

        System.out.println("-----------------------------------------");
        System.out.println(" ------------------- intesect of 2 arays -----------------------");
        int intesect[]=intersection(arr1,arr3);
        for (int i=0;i<intesect.length;i++){
            System.out.print(intesect[i]+" ");
        }
        System.out.println();
        intesect=intersect_duplicates(arr2,arr4);
        for (int i=0;i<intesect.length;i++){
            System.out.print(intesect[i]+" ");
        }
        System.out.println();
        intesect=intersect_duplicates(arr1,arr3);
        for (int i=0;i<intesect.length;i++){
            System.out.print(intesect[i]+" ");
        }

    }
}