package ru.amstolbov.part3tostreamapi.collection.priorityqueue;

import java.util.Comparator;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int pos = 0;
        if (tasks.size() > 0) {
            Task nextTask = tasks.stream()
                    .filter(el -> el.getPriority() >= task.getPriority())
                    .min(Comparator.comparingInt(p -> p.getPriority()))
                    .get();
            pos = tasks.indexOf(nextTask);
        }
        tasks.add(pos, task);

    }

    public Task take() {
        return this.tasks.poll();
    }
}
