package javaCoreT.javaCoreT_01;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by longguangbin on 2018/5/6.
 */

class Sex {
    private static final Sex MALE = new Sex("男");
    private static final Sex FEMALE = new Sex("女");
    private String title;

    private Sex(String title) {
        this.title = title;
    }

    public static Sex getInstance(String msg) {
        switch (msg) {
            case "male":
                return MALE;
            case "female":
                return FEMALE;
            default:
                return null;
        }
    }

    public String getTitle() {
        return this.title;
    }
}

public class javaMultiton {
    //    learn:
    //    1、多例设计模式。
    public static void main(String[] args) {
        Sex male = Sex.getInstance("male");
        System.out.println(male.getTitle());
    }
}
