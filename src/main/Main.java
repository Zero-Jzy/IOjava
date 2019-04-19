import entity.Vid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Vid> map = new HashMap<>();
        FileReader fileReader = new FileReader("/home/phu/IdeaProjects/JavaWeb/Test/src/test6/input.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null){
            String[] iFor = line.split("\\s{2,} ");

            String date = iFor[0];
            String id = iFor[1];
            String title = iFor[2];
            long view = Long.parseLong(iFor[3]);

            long currentView = 0;
            if (map.containsKey(id)){
                currentView = map.get(id).getView();
            }
            currentView += view;
            Vid vid = new Vid(id,date,title,currentView);
            map.put(iFor[1],vid);
        }

        for (Map.Entry<String,Vid> list: map.entrySet()){
            System.out.println(list.getValue().getId()+":"+list.getValue().getView());
        }

    }
}
