package a1023.ex_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Student {
    private String name;
    private int score;

    public Student (String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
