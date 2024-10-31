package mergeSort;

import org.springframework.expression.spel.ast.Literal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executorService;
    public Sorter(List<Integer> arr, ExecutorService es){
        this.executorService = es;
        this.arrayToSort = arr;
    }



    @Override
    public List<Integer> call() throws Exception {
        // the entire merge sort logic goes here

        if(arrayToSort.size()<=1){
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        for(int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for(int i = mid; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftSorter = new Sorter(leftArray, executorService);
        Sorter rightSorter = new Sorter(rightArray, executorService);

        Future<List<Integer>> leftSortedFutureArray =  executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedFutureArray = executorService.submit(rightSorter);

        //Merge both the sorted arrays

        int i=0; int j=0;

        List<Integer> leftSortedArray = leftSortedFutureArray.get();
        List<Integer> rightSortedArray = rightSortedFutureArray.get();

        List<Integer> sortedArray = new ArrayList<>();


        while(i<leftSortedArray.size() && j<rightSortedArray.size() ){

            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
               sortedArray.add(rightSortedArray.get(j));
               j++;
            }
        }
        while(i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i++));
        }
        while(j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j++));
        }

        return sortedArray;






    }
}
