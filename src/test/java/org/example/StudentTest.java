package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @Test
    public void testTreeMapNameOrdered() {
        Map<String, Student> studentMap = new TreeMap<>();

        studentMap.put("Smith", new Student(1, "Smith", "John", 3.5));
        studentMap.put("Brown", new Student(2, "Brown", "James", 3.8));
        studentMap.put("Johnson", new Student(3, "Johnson", "Emily", 3.2));

        List<String> expectedOrder = Arrays.asList("Brown", "Johnson", "Smith");
        assertEquals(expectedOrder, new ArrayList<>(studentMap.keySet()));
    }

    @Test
    public void testTreeMapGpeOrdered() {
        Comparator<Student> gpeComparator = Comparator.comparingDouble(Student::getGpe);
        Map<Student, Integer> studentMap = new TreeMap<>(gpeComparator);

        studentMap.put(new Student(1, "Smith", "John", 3.5), 1);
        studentMap.put(new Student(2, "Brown", "James", 3.8), 2);
        studentMap.put(new Student(3, "Johnson", "Emily", 3.2), 3);

        List<Student> expectedOrder = Arrays.asList(
                new Student(3, "Johnson", "Emily", 3.2),
                new Student(1, "Smith", "John", 3.5),
                new Student(2, "Brown", "James", 3.8)
        );

        assertEquals(expectedOrder, new ArrayList<>(studentMap.keySet()));
    }

    @Test
    public void testLinkedHashMapOrder() {
        Map<String, Student> studentMap = new LinkedHashMap<>();

        studentMap.put("Smith", new Student(1, "Smith", "John", 3.5));
        studentMap.put("Brown", new Student(2, "Brown", "James", 3.8));
        studentMap.put("Johnson", new Student(3, "Johnson", "Emily", 3.2));

        List<String> expectedOrder = Arrays.asList("Smith", "Brown", "Johnson");
        assertEquals(expectedOrder, new ArrayList<>(studentMap.keySet()));
    }

    @Test
    public void testHashMapUnordered() {
        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("Smith", new Student(1, "Smith", "John", 3.5));
        studentMap.put("Brown", new Student(2, "Brown", "James", 3.8));
        studentMap.put("Johnson", new Student(3, "Johnson", "Emily", 3.2));

        assertTrue(studentMap.containsKey("Smith"));
        assertTrue(studentMap.containsKey("Brown"));
        assertTrue(studentMap.containsKey("Johnson"));
    }
}
