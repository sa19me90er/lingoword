package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nl_words")
public class Word {

    @Id
    private String word;

    //word length for game level
    private int length;

    public Word(String word, int length) {
        this.word = word;
        this.length = length;
    }


}
