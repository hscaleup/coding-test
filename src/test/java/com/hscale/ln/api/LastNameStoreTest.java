package com.hscale.ln.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastNameStoreTest {
   private LastNameStore lastNameStore;

    @BeforeEach
    void setUp() {
        this.lastNameStore = new LastNameStore();

        lastNameStore.addPerson(new Person("John", "Doe"));
        lastNameStore.addPerson(new Person("Andy", "Doe"));
        lastNameStore.addPerson(new Person("Steve", "Smith"));
        lastNameStore.addPerson(new Person("Steve", "Harvey"));
    }

    @Test
    void should_return_lists_of_persons_on_passing_lastName() {

        List<Person> getPersons = lastNameStore.getPersonsByLastName("Doe");
        System.out.println(getPersons);
        assertEquals(2, getPersons.size(), "List Size matched with expected lists of person");
        assertEquals("John", getPersons.get(0).getFirstName());
        assertEquals("Andy", getPersons.get(1).getFirstName());
    }

    @Test
    void should_return_single_person_on_passing_lastName() {

        List<Person> getPersons = lastNameStore.getPersonsByLastName("Smith");
        System.out.println(getPersons);
        assertEquals(1, getPersons.size(), "List Size matched with expected lists of person");
        assertEquals("Steve", getPersons.get(0).getFirstName());
    }

    @Test
    void should_return_zero_list_of_person_when_no_lastName_is_present() {

        List<Person> getPersons = lastNameStore.getPersonsByLastName("Singh");
        System.out.println(getPersons);
        assertEquals(0, getPersons.size(), "List Size matched with expected lists of person");
    }

}