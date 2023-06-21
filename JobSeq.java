package Greedy;   
import java.util.*;
public class JobSeq {
    static class JOB {
        int deadline;
        int profit;
        int id;

    public JOB(int i,int d,int p){
          id = i;
          deadline = d;
          profit = p;
        }
    }
    public static void main(String[] args) {
        int jobinfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<JOB> jobs = new ArrayList<>();

        for (int i = 0; i < jobinfo.length; i++) {
            jobs.add(new JOB(i, jobinfo[i][0], jobinfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            JOB curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max Jobs = " +seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();

    }
}
