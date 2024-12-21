import java.util.*;
public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Solution 1: Using an Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i == 3) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        //Solution 2: Using ListIterator in reverse order 
        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> litr = list.listIterator(list.size());
        while(litr.hasPrevious()){
            if(litr.previous()==3){
                litr.remove();
            }
        }
        System.out.println("Solution 2: " + list);

        //Solution 3: Copy and remove
        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> newList = new ArrayList<>();
        for(int i : list){
            if(i != 3){
                newList.add(i);
            }
        }
        System.out.println("Solution 3: " + newList);
    }
}