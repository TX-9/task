package com.tx9.task.service;

import com.tx9.task.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
