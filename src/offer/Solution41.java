package offer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author tenghaoxiang
 * @date 19-7-29 下午9:42
 * @Description
 */
public class Solution41 {

    int count;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    public void Insert(Integer num) {
        count++;
        if ((count & 1) == 0) {
            if (!maxHeap.isEmpty() && num < maxHeap.peek()) {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        } else {
            if (!minHeap.isEmpty() && num > minHeap.peek()) {
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

    public Double GetMedian() {

        double result;
        if ((count & 1) == 1) {
            result = maxHeap.peek();
        } else {
            result = (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return result;

    }

}
