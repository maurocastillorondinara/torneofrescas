package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Team<T extends Comparable>{
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

    public void ageSort()
    {
        Collections.sort(this.teamList);
    }



}
