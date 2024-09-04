/**
* @author Deuel, Erin, Laila
* @param setting all the names
* @return returning the tasks 
*/

import java.io.BufferedWriter;
import java.util.ArrayList;

public class FileManager {
    private String filename;
    
    public FileManager(String filename) {
        
        this.filename = filename;
    }



public void writeTask(ArrayList tasks) throws IOException {
    //files
    BufferedWriter writer = new BufferedWriter(new FileWrite(filename));
    for (Task task : tasks) {
        writer.writer(FileTaskSerializer.serialize(task));
        writer.newLine();
    }
        writer.close();
    
}

public ArrayList readTasks() throws IOException{
    
    ArrayList<E> tasks = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = readerLine())! = null) {
        tasks.add(FileTaskSerializer.deserialize(line));
    }
    reader.close();
    return tasks;
}
}