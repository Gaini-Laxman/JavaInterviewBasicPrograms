package com.javafullstackguru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {
    private final String name;
    private final Integer age;
    private final List<String> hobbies;
    public ImmutablePerson(String name, Integer age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies);
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public static void main(String[] args) {
        // Create a list of hobbies
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Playing cricket");
        hobbies.add("Watching movies");
        // Create an ImmutablePerson object
        ImmutablePerson ip = new ImmutablePerson("Laxman", 30, hobbies);
        // Access fields using getter methods
        String name = ip.getName();
        Integer age = ip.getAge();
        List<String> hobbiesList = ip.getHobbies();
        // Print the details
        System.out.println(name + "-" + age + "-" + hobbiesList);
    }

}
