package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Team<T extends Comparable> extends Thread{
    private List<T> teamList;


    public Team(){
        teamList = new ArrayList<T>();
    }

    public void addMember(T member)
    {
        this.teamList.add(member);
    }

    public T removeMember(int index)
    {
       return this.teamList.remove(index);
    }

    public int sizeMember()
    {
        return this.teamList.size();
    }

    public void sort()
    {
        Collections.sort(this.teamList);
    }

    public void printAll(){
        for (T element:
                teamList)
        {
            System.out.println(element.toString());
        }
    }




}
