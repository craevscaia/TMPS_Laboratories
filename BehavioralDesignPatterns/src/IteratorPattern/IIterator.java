package IteratorPattern;

import MediatorPattern.Student;

public interface IIterator {
    public boolean hasNext();
    public Student next();
}
