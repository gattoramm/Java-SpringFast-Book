package part1.ch6.ex6.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comment {
    private String text;
    private String author;

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
