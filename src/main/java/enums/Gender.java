package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * @author Evgeny Borisov
 */
@Getter
public enum Gender {
    MALE(1,"Муж"), FEMALE(2,"Жен"), SHEMALE(5,"Чудо");

    private final int dbCode;
    private final String russDescription;


    Gender(int dbCode, String russDescription) {
        this.dbCode = dbCode;
        this.russDescription = russDescription;
        System.out.println(russDescription+ " "+dbCode);
    }

    @Override
    public String toString() {
        return this.russDescription;
    }





    public static Gender findByDbCode(int dbCode) throws IllegalStateException {


        for (Gender gender : values()) {
            if (gender.dbCode == dbCode) {
                return gender;
            }
        }


        throw new GenderNotExistsException(dbCode + " not supported yet");



    }






}
