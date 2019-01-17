package reflection.examWeek07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkerReader {
    private FileReader reader = new FileReader();

    public List<Worker> getWorkers() {
        List<String> lines = reader.asLines("exercises/week09/exercise05/films.csv");
        lines.remove(0);
        return toWorkers(lines);

    }

    private List<Worker> toWorkers(List<String> lines) {
        List<Worker> workers = new ArrayList<>();
        for (String line : lines) {
            workers.add(toWorker(line));
        }
        return workers;
    }

    private Worker toWorker(String line) {
        List<String> columns = Arrays.asList(line.split(";"));
        String name = columns.get(0);
        String department = columns.get(1);
        String salary = columns.get(2);
        String account = columns.get(3);
        return new Worker(name, department, Integer.valueOf(salary), account);
    }
}
