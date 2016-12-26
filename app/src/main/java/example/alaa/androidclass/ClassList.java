package example.alaa.androidclass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alaa ab on 12/21/2016.
 */

public class ClassList {

    public static List<OneClass> getListData() {
        List<OneClass> data = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            OneClass item = new OneClass();
            item.setNumber(i);
            item.setSubject("Android");
            data.add(item);
        }

        return data;
    }

}
