package com.hscale.ln.api;

import java.util.*;

public class LastNameStore {

  private Map<String,List<Person>> map;

    public LastNameStore() {
        this.map = new HashMap<>();
    }

    public Map<String,List<Person>> addPerson(Person person){
        String lastName= person.getLastName();
        if(map.containsKey(lastName)){
            map.get(lastName).add(person);
        }else{
            List<Person> personList = new ArrayList<>();
            personList.add(person);
            map.put(lastName,personList);
        }
        return map;
    }

    // to do

    public List<Person> getPersonsByLastName(String lastName) {
        return map.getOrDefault(lastName, new ArrayList<>());
    }


}
